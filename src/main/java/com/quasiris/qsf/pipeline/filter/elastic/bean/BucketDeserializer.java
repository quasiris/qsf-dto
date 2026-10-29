package com.quasiris.qsf.pipeline.filter.elastic.bean;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.*;

public class BucketDeserializer extends StdDeserializer<List<Bucket>> {

    public BucketDeserializer() {
        super(Object.class);
    }

    public BucketDeserializer(Class<?> vc) {
        super(vc);
    }

    public BucketDeserializer(JavaType valueType) {
        super(valueType);
    }

    public BucketDeserializer(StdDeserializer<?> src) {
        super(src);
    }

    private ObjectMapper mapper = new ObjectMapper();

    private static final Set<String> JSON_KEY_AGG_EXCLUDES = new HashSet<>(Arrays.asList("meta"));

    @Override
    public List<Bucket> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = p.getCodec().readTree(p);
        List<Bucket> buckets = new ArrayList<>();
        if (node.isArray()) {
            Iterator<JsonNode> elements = node.elements();
            while (elements.hasNext()) {
                JsonNode element = elements.next();
                Bucket bucket = mapper.convertValue(element, Bucket.class);

                Iterator<Map.Entry<String, JsonNode>> fields = element.fields();
                while (fields.hasNext()) {
                    Map.Entry<String, JsonNode> field = fields.next();
                    if(field.getValue().isObject() && field.getValue().get("doc_count") != null) {
                        addCustomData(bucket, field.getKey(), field.getValue().get("doc_count").asLong());
                    } else if(field.getValue().isObject() && field.getValue().get("value") != null) {
                        addCustomData(bucket, field.getKey(), field.getValue().get("value").asDouble());
                    } else if(field.getValue().isObject() && field.getValue().get("values") != null && field.getValue().get("values").isObject()) {
                        Map<String, Object> valuesMap = new LinkedHashMap<>();
                        field.getValue().get("values").fields().forEachRemaining(e ->
                                valuesMap.put(e.getKey(), e.getValue().isNull() ? null : e.getValue().asDouble()));
                        addCustomData(bucket, field.getKey(), valuesMap);
                    } else if(isTopHits(field.getValue())) {
                        addCustomData(bucket, field.getKey(), extractTopHitsSources(field.getValue()));
                    }
                }
                buckets.add(bucket);

            }
        }
        return buckets;
    }

    private boolean isTopHits(JsonNode node) {
        return node.isObject()
                && node.get("hits") != null
                && node.get("hits").isObject()
                && node.get("hits").get("hits") != null
                && node.get("hits").get("hits").isArray();
    }

    /**
     * Keep the _source of each hit of a top_hits sub aggregation, so a result transformer
     * can access document values per bucket (e.g. the original cased value of a lowercase terms bucket).
     */
    private List<Map<String, Object>> extractTopHitsSources(JsonNode topHitsNode) {
        List<Map<String, Object>> sources = new ArrayList<>();
        for (JsonNode hit : topHitsNode.get("hits").get("hits")) {
            JsonNode source = hit.get("_source");
            if (source != null && source.isObject()) {
                sources.add(mapper.convertValue(source, new TypeReference<Map<String, Object>>() {}));
            }
        }
        return sources;
    }

    void addCustomData(Bucket bucket, String key, Object value) {
        if(bucket.getCustomData() == null) {
            bucket.setCustomData(new HashMap<>());
        }
        bucket.getCustomData().put(key, value);

    }
}

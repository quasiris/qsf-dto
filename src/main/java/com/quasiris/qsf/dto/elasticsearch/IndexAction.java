package com.quasiris.qsf.dto.elasticsearch;

import com.quasiris.qsf.dto.common.BaseDTO;
import javax.annotation.Nullable;
import java.util.Locale;

/**
 * Action for a single document
 */
public class IndexAction extends BaseDTO {
    public enum OpType {
        INDEX(0), // create or update
        CREATE(1), // create if not exist otherwise fail
        UPDATE(2), // same as index
        DELETE(3); // remove doc

        private final byte op;
        private final String lowercase;

        OpType(int op) {
            this.op = (byte) op;
            this.lowercase = this.toString().toLowerCase(Locale.ROOT);
        }

        public byte getId() {
            return op;
        }

        public String getLowercase() {
            return lowercase;
        }
    }

    private IndexDocument doc;
    private OpType opType = OpType.INDEX;
    private String index;
    private String type = "_doc";

    public IndexAction() {
    }

    public IndexAction(IndexDocument doc, String index) {
        this(doc, null, index, null);
    }

    public IndexAction(IndexDocument doc, @Nullable OpType opType, String index) {
        this(doc, opType, index, null);
    }

    public IndexAction(IndexDocument doc, @Nullable OpType opType, String index, @Nullable String type) {
        this.doc = doc;
        if(opType != null) {
            this.opType = opType;
        }
        this.index = index;
        if(type != null && !"".equals(type)) {
            this.type = type;
        }
    }

    public IndexDocument getDoc() {
        return doc;
    }

    public void setDoc(IndexDocument doc) {
        this.doc = doc;
    }

    public OpType getOpType() {
        return opType;
    }

    public void setOpType(OpType opType) {
        this.opType = opType;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package com.quasiris.qsf.dto.query;

import com.quasiris.qsf.dto.common.BaseDTO;

public class ResultDTO extends BaseDTO {

    private DocumentsDTO document;

    private FacetDTO facet;
    private VariantDTO variant;
    private SpellcheckDTO spellcheck;
    private PagingDTO paging;

    /**
     * Getter for property 'document'.
     *
     * @return Value for property 'document'.
     */
    public DocumentsDTO getDocument() {
        return document;
    }

    /**
     * Setter for property 'document'.
     *
     * @param document Value to set for property 'document'.
     */
    public void setDocument(DocumentsDTO document) {
        this.document = document;
    }

    /**
     * Getter for property 'facet'.
     *
     * @return Value for property 'facet'.
     */
    public FacetDTO getFacet() {
        return facet;
    }

    /**
     * Setter for property 'facet'.
     *
     * @param facet Value to set for property 'facet'.
     */
    public void setFacet(FacetDTO facet) {
        this.facet = facet;
    }

    /**
     * Getter for property 'paging'.
     *
     * @return Value for property 'paging'.
     */
    public PagingDTO getPaging() {
        return paging;
    }

    /**
     * Setter for property 'paging'.
     *
     * @param paging Value to set for property 'paging'.
     */
    public void setPaging(PagingDTO paging) {
        this.paging = paging;
    }

    public SpellcheckDTO getSpellcheck() {
        return spellcheck;
    }

    public void setSpellcheck(SpellcheckDTO spellcheck) {
        this.spellcheck = spellcheck;
    }

    public VariantDTO getVariant() {
        return variant;
    }

    public void setVariant(VariantDTO variant) {
        this.variant = variant;
    }
}

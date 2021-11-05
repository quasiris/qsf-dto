package com.quasiris.qsf.dto.response;

/**
 * Created by mki on 11.11.16.
 */
public class DidYouMeanResult {

    private String name;

    // didYouMean, corrected
    private String type;

    private String didYouMean;

    private String corrected;

    private String original;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDidYouMean() {
        return didYouMean;
    }

    public void setDidYouMean(String didYouMean) {
        this.didYouMean = didYouMean;
    }

    /**
     * Getter for property 'type'.
     *
     * @return Value for property 'type'.
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for property 'type'.
     *
     * @param type Value to set for property 'type'.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for property 'corrected'.
     *
     * @return Value for property 'corrected'.
     */
    public String getCorrected() {
        return corrected;
    }

    /**
     * Setter for property 'corrected'.
     *
     * @param corrected Value to set for property 'corrected'.
     */
    public void setCorrected(String corrected) {
        this.corrected = corrected;
    }

    /**
     * Getter for property 'original'.
     *
     * @return Value for property 'original'.
     */
    public String getOriginal() {
        return original;
    }

    /**
     * Setter for property 'original'.
     *
     * @param original Value to set for property 'original'.
     */
    public void setOriginal(String original) {
        this.original = original;
    }
}

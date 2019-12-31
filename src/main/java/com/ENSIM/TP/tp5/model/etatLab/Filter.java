package com.ENSIM.TP.tp5.model.etatLab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Filter {
    private String postcode;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "postcode='" + postcode + '\'' +
                '}';
    }
}

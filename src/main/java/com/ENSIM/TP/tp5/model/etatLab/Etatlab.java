package com.ENSIM.TP.tp5.model.etatLab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Etatlab
{
    private String type;
    private String version;
    private List<Features> features = null;
    private String attribution;
    private String license;
    private String query;
    private Filter filter;
    private int limit;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Features> getFeatures() {
        return features;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Etatlab{" +
                "type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", features=" + features +
                ", attribution='" + attribution + '\'' +
                ", license='" + license + '\'' +
                ", query='" + query + '\'' +
                ", filter=" + filter +
                ", limit=" + limit +
                '}';
    }
}

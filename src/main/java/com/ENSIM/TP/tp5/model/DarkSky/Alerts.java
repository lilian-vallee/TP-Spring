package com.ENSIM.TP.tp5.model.DarkSky;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Alerts
{
    private String title;
    private List<String> regions;
    private String severity;
    private Integer time;
    private Integer expires;
    private String description;
    private String uri;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getExpires() {
        return expires;
    }

    public void setExpires(Integer expires) {
        this.expires = expires;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "Alerts{" +
                "title='" + title + '\'' +
                ", regions=" + regions +
                ", severity='" + severity + '\'' +
                ", time=" + time +
                ", expires=" + expires +
                ", description='" + description + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}

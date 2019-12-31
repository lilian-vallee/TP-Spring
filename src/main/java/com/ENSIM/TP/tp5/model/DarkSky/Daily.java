package com.ENSIM.TP.tp5.model.DarkSky;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily
{
    private String summary;
    private String icon;
    private List<DataDay> data;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<DataDay> getData() {
        return data;
    }

    public void setData(List<DataDay> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", data=" + data +
                '}';
    }
}

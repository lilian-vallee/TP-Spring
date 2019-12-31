package com.ENSIM.TP.tp5.model.DarkSky;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flags
{
    private List<String> sources;
    private Double nearestStation;
    private String units;

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public Double getNearestStation() {
        return nearestStation;
    }

    public void setNearestStation(Double nearestStation) {
        this.nearestStation = nearestStation;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Flags{" +
                "sources=" + sources +
                ", nearestStation=" + nearestStation +
                ", units='" + units + '\'' +
                '}';
    }
}

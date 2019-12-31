package com.ENSIM.TP.tp5.model.DarkSky;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DarkSky
{
    private Double latitude;
    private Double longitude;
    private String timezone;
    private Currently currently;
    private Daily daily;
    private List<Alerts> alerts;
    private Flags flags;
    private Integer offset;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Currently getCurrently() {
        return currently;
    }

    public void setCurrently(Currently currently) {
        this.currently = currently;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    public List<Alerts> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Alerts> alerts) {
        this.alerts = alerts;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "DarkSky{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", timezone='" + timezone + '\'' +
                ", currently=" + currently +
                ", daily=" + daily +
                ", alerts=" + alerts +
                ", flags=" + flags +
                ", offset=" + offset +
                '}';
    }
}

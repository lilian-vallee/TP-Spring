package com.ENSIM.TP.tp5.model.DarkSky;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currently
{
    private Integer time;
    private String summary;
    private String icon;
    private Integer nearestStormDistance;
    private Integer nearestStormBearing;
    private Double precipIntensity;
    private Double precipProbability;
    private Double temperature;
    private Double apparentTemperature;
    private Double dewpoint;
    private Double humidity;
    private Double pressure;
    private Integer windspeed;
    private Double windGust;
    private Integer windBearing;
    private Double cloudcover;
    private Integer uvIndex;
    private Integer visibility;
    private Double ozone;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

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

    public Integer getNearestStormDistance() {
        return nearestStormDistance;
    }

    public void setNearestStormDistance(Integer nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public Integer getNearestStormBearing() {
        return nearestStormBearing;
    }

    public void setNearestStormBearing(Integer nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
    }

    public Double getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(Double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public Double getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(Double precipProbability) {
        this.precipProbability = precipProbability;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(Double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public Double getDewpoint() {
        return dewpoint;
    }

    public void setDewpoint(Double dewpoint) {
        this.dewpoint = dewpoint;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Integer getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Integer windspeed) {
        this.windspeed = windspeed;
    }

    public Double getWindGust() {
        return windGust;
    }

    public void setWindGust(Double windGust) {
        this.windGust = windGust;
    }

    public Integer getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(Integer windBearing) {
        this.windBearing = windBearing;
    }

    public Double getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Double cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Integer getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Double getOzone() {
        return ozone;
    }

    public void setOzone(Double ozone) {
        this.ozone = ozone;
    }

    @Override
    public String toString() {
        return "Currently{" +
                "time=" + time +
                ", summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", nearestStormDistance=" + nearestStormDistance +
                ", nearestStormBearing=" + nearestStormBearing +
                ", precipIntensity=" + precipIntensity +
                ", precipProbability=" + precipProbability +
                ", temperature=" + temperature +
                ", apparentTemperature=" + apparentTemperature +
                ", dewpoint=" + dewpoint +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", windspeed=" + windspeed +
                ", windGust=" + windGust +
                ", windBearing=" + windBearing +
                ", cloudcover=" + cloudcover +
                ", uvIndex=" + uvIndex +
                ", visibility=" + visibility +
                ", ozone=" + ozone +
                '}';
    }
}

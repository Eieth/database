package com.resfir.database.entity;

import java.sql.Date;

public class WaterLevelStationCharacteristicValues {
    private int stationCode;
    private String stationType;
    private float measuredMaxWaterLevel;
    private Date measuredMaxWaterLevelTime;
    private float measuredMinWaterLevel;
    private Date measuredMinWaterLevelTime;

    public int getStationCode() {
        return stationCode;
    }

    public void setStationCode(int stationCode) {
        this.stationCode = stationCode;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public float getMeasuredMaxWaterLevel() {
        return measuredMaxWaterLevel;
    }

    public void setMeasuredMaxWaterLevel(float measuredMaxWaterLevel) {
        this.measuredMaxWaterLevel = measuredMaxWaterLevel;
    }

    public Date getMeasuredMaxWaterLevelTime() {
        return measuredMaxWaterLevelTime;
    }

    public void setMeasuredMaxWaterLevelTime(Date measuredMaxWaterLevelTime) {
        this.measuredMaxWaterLevelTime = measuredMaxWaterLevelTime;
    }

    public float getMeasuredMinWaterLevel() {
        return measuredMinWaterLevel;
    }

    public void setMeasuredMinWaterLevel(float measuredMinWaterLevel) {
        this.measuredMinWaterLevel = measuredMinWaterLevel;
    }

    public Date getMeasuredMinWaterLevelTime() {
        return measuredMinWaterLevelTime;
    }

    public void setMeasuredMinWaterLevelTime(Date measuredMinWaterLevelTime) {
        this.measuredMinWaterLevelTime = measuredMinWaterLevelTime;
    }
}

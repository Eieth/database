package com.resfir.database.entity;

import java.sql.Date;

public class HydrologicalStationCharacteristicValues {
    private int stationCode;
    private String stationType;
    private float averageRunoff;
    private float measuredMaxFlow;
    private Date measuredMaxFlowTime;
    private float measuredMinFlow;
    private Date measuredMinFlowTime;

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

    public float getAverageRunoff() {
        return averageRunoff;
    }

    public void setAverageRunoff(float averageRunoff) {
        this.averageRunoff = averageRunoff;
    }

    public float getMeasuredMaxFlow() {
        return measuredMaxFlow;
    }

    public void setMeasuredMaxFlow(float measuredMaxFlow) {
        this.measuredMaxFlow = measuredMaxFlow;
    }

    public Date getMeasuredMaxFlowTime() {
        return measuredMaxFlowTime;
    }

    public void setMeasuredMaxFlowTime(Date measuredMaxFlowTime) {
        this.measuredMaxFlowTime = measuredMaxFlowTime;
    }

    public float getMeasuredMinFlow() {
        return measuredMinFlow;
    }

    public void setMeasuredMinFlow(float measuredMinFlow) {
        this.measuredMinFlow = measuredMinFlow;
    }

    public Date getMeasuredMinFlowTime() {
        return measuredMinFlowTime;
    }

    public void setMeasuredMinFlowTime(Date measuredMinFlowTime) {
        this.measuredMinFlowTime = measuredMinFlowTime;
    }
}

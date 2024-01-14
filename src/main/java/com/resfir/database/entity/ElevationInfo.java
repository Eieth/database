package com.resfir.database.entity;

public class ElevationInfo {
    private int elevationCode;
    private String stationType;
    private float stationElevation;
    private String referenceFrameName;
    private float referenceFrameCorrection;

    public int getElevationCode() {
        return elevationCode;
    }

    public void setElevationCode(int elevationCode) {
        this.elevationCode = elevationCode;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public float getStationElevation() {
        return stationElevation;
    }

    public void setStationElevation(float stationElevation) {
        this.stationElevation = stationElevation;
    }

    public String getReferenceFrameName() {
        return referenceFrameName;
    }

    public void setReferenceFrameName(String referenceFrameName) {
        this.referenceFrameName = referenceFrameName;
    }

    public float getReferenceFrameCorrection() {
        return referenceFrameCorrection;
    }

    public void setReferenceFrameCorrection(float referenceFrameCorrection) {
        this.referenceFrameCorrection = referenceFrameCorrection;
    }
}

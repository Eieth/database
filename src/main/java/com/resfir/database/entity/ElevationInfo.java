package com.resfir.database.entity;

import lombok.Data;

@Data
public class ElevationInfo {
    private int elevationCode;
    private String stationType;
    private float stationElevation;
    private String referenceFrameName;
    private float referenceFrameCorrection;
}

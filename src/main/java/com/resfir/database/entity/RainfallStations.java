package com.resfir.database.entity;

import lombok.Data;

@Data
public class RainfallStations {
    private String stationName;
    private int stationCode;
    private String watershedDistrict;
    private String drainageSystem;
    private float vesselHeight;
    private float averageRainfall;
    private float maximumRainfall;
    private String manageUnit;
    private String appearYear;
    private String note;
}

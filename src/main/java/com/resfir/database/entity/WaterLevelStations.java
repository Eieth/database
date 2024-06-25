package com.resfir.database.entity;

import lombok.Data;

@Data
public class WaterLevelStations {
    private String stationName;
    private int stationCode;
    private String watershedDistrict;
    private String drainageSystem;
    private String river;
    private int square;
    private String setDate;
    private String stationManage;
    private String stationFeature;
    private String stationAddress;
    private String surveyTeam;
    private String buildUnit;
    private String manageUnit;
    private String longitude;
    private String latitude;
    private String note;
}

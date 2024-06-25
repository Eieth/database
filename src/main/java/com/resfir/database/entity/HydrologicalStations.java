package com.resfir.database.entity;

import lombok.Data;

@Data
public class HydrologicalStations {
    private String stationName;
    private int stationCode;
    private String watershedDistrict;
    private String drainageSystem;
    private String river;
    private int square;
    private String stationManage;
    private String stationFeature;
    private String setDate;
    private String stationAddress;
    private String stationClassify;
    private float stationHeight;
    private String baseName;
    private String baseAmendment;
    private String surveyTeam;
    private String buildUnit;
    private float averageFlowRate;
    private float actualMaximumFlowRate;
    private String actualMaximumFlowTime;
    private float actualMinimalFlowRate;
    private String actualMinimalFlowTime;
    private String manageUnit;
    private String longitude;
    private String latitude;
    private String note;
}

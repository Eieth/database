package com.resfir.database.entity;

import lombok.Data;

@Data
public class StationBasicInfo {
    private int stationCode;
    private String stationType;
    private String basinWaterSystem;
    private String riverName;
    private String installationDate;
    private String drainageArea;
    private String stationClassManagement;
    private String stationAttribute;
    private String stationClassification;
    private int stationAddressCode;
    private String constructionManagementUnit;
}

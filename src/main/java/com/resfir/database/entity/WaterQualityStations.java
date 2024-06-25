package com.resfir.database.entity;

import lombok.Data;

@Data
public class WaterQualityStations {
    private String stationName;
    private int stationCode;
    private String sectionName;
    private String watershedDistrict;
    private String drainageSystem;
    private String river;
    private String setDate;
    private String primaryZoneName;
    private String secondaryZoneName;
    private String stationAddress;
    private String manageUnit;
    private String longitude;
    private String latitude;
}

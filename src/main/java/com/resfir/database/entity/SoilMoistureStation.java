package com.resfir.database.entity;

import lombok.Data;

@Data
public class SoilMoistureStation {
    private String stationName;
    private int stationCode;
    private String watershedDistrict;
    private String setDate;
    private String stationAddress;
    private String manageUnit;
    private String longitude;
    private String latitude;
}

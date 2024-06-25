package com.resfir.database.entity;

import lombok.Data;

@Data
public class EvaporationStation {
    private String stationName;
    private int stationCode;
    private String watershedDistrict;
    private String setDate;
    private String stationAddress;
    private String manageUnit;
    private String longitude;
    private String latitude;
    private float averageEvaporation;
    private String evaporatorModel;
    private String note;
}

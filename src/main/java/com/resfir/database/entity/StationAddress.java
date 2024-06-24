package com.resfir.database.entity;

import lombok.Data;

@Data
public class StationAddress {
    private int stationAddressCode;
    private String stationType;
    private String provinceAutonomousRegionMunicipality;
    private String cityDistrict;
    private String countyCity;
    private String townVillage;
    private String villageStreet;
}

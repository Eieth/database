package com.resfir.database.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class WaterLevelStationCharacteristicValues {
    private int stationCode;
    private String stationType;
    private float measuredMaxWaterLevel;
    private Date measuredMaxWaterLevelTime;
    private float measuredMinWaterLevel;
    private Date measuredMinWaterLevelTime;
}

package com.resfir.database.entity;

import lombok.Data;

import java.sql.Date;
@Data
public class HydrologicalStationCharacteristicValues {
    private int stationCode;
    private String stationType;
    private float averageRunoff;
    private float measuredMaxFlow;
    private Date measuredMaxFlowTime;
    private float measuredMinFlow;
    private Date measuredMinFlowTime;
}

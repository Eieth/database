package com.resfir.database.entity;

import lombok.Data;

@Data
public class RainfallStationCharacteristicValues {
    private int stationCode;
    private String stationType;
    private float instrumentHeight;
    private float averageRainfall;
    private float measuredMaxRainfall;
    private int occurrenceYear;
}

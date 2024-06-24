package com.resfir.database.entity;

import lombok.Data;

@Data
public class EvaporationStationCharacteristicValues {
    private int stationCode;
    private String stationType;
    private float averageEvaporation;
    private String evaporationInstrumentModel;
}

package com.resfir.database.entity;

public class EvaporationStationCharacteristicValues {
    private int stationCode;
    private String stationType;
    private float averageEvaporation;
    private String evaporationInstrumentModel;

    public int getStationCode() {
        return stationCode;
    }

    public void setStationCode(int stationCode) {
        this.stationCode = stationCode;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public float getAverageEvaporation() {
        return averageEvaporation;
    }

    public void setAverageEvaporation(float averageEvaporation) {
        this.averageEvaporation = averageEvaporation;
    }

    public String getEvaporationInstrumentModel() {
        return evaporationInstrumentModel;
    }

    public void setEvaporationInstrumentModel(String evaporationInstrumentModel) {
        this.evaporationInstrumentModel = evaporationInstrumentModel;
    }
}

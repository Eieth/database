package com.resfir.database.entity;

public class RainfallStationCharacteristicValues {
    private int stationCode;
    private String stationType;
    private float instrumentHeight;
    private float averageRainfall;
    private float measuredMaxRainfall;
    private int occurrenceYear;

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

    public float getInstrumentHeight() {
        return instrumentHeight;
    }

    public void setInstrumentHeight(float instrumentHeight) {
        this.instrumentHeight = instrumentHeight;
    }

    public float getAverageRainfall() {
        return averageRainfall;
    }

    public void setAverageRainfall(float averageRainfall) {
        this.averageRainfall = averageRainfall;
    }

    public float getMeasuredMaxRainfall() {
        return measuredMaxRainfall;
    }

    public void setMeasuredMaxRainfall(float measuredMaxRainfall) {
        this.measuredMaxRainfall = measuredMaxRainfall;
    }

    public int getOccurrenceYear() {
        return occurrenceYear;
    }

    public void setOccurrenceYear(int occurrenceYear) {
        this.occurrenceYear = occurrenceYear;
    }
}

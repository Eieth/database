package com.resfir.database.entity;

public class StationAddress {
    private int stationAddressCode;
    private String stationType;
    private String provinceAutonomousRegionMunicipality;
    private String cityDistrict;
    private String countyCity;
    private String townVillage;
    private String villageStreet;

    public int getStationAddressCode() {
        return stationAddressCode;
    }

    public void setStationAddressCode(int stationAddressCode) {
        this.stationAddressCode = stationAddressCode;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public String getProvinceAutonomousRegionMunicipality() {
        return provinceAutonomousRegionMunicipality;
    }

    public void setProvinceAutonomousRegionMunicipality(String provinceAutonomousRegionMunicipality) {
        this.provinceAutonomousRegionMunicipality = provinceAutonomousRegionMunicipality;
    }

    public String getCityDistrict() {
        return cityDistrict;
    }

    public void setCityDistrict(String cityDistrict) {
        this.cityDistrict = cityDistrict;
    }

    public String getCountyCity() {
        return countyCity;
    }

    public void setCountyCity(String countyCity) {
        this.countyCity = countyCity;
    }

    public String getTownVillage() {
        return townVillage;
    }

    public void setTownVillage(String townVillage) {
        this.townVillage = townVillage;
    }

    public String getVillageStreet() {
        return villageStreet;
    }

    public void setVillageStreet(String villageStreet) {
        this.villageStreet = villageStreet;
    }
}

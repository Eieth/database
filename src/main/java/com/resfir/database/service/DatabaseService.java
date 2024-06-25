package com.resfir.database.service;

import com.resfir.database.entity.*;

import java.util.List;

public interface DatabaseService {
    UniResponse<List<EvaporationStation>> getEvaporationStation();

    UniResponse<List<HistoricalChanges>> getHistoricalChanges();

    UniResponse<List<HydrologicalStations>> getHydrologicalStations();

    UniResponse<List<RainfallStations>> getRainfallStations();

    UniResponse<List<SoilMoistureStation>> getSoilMoistureStation();

    UniResponse<List<StationBasicInfo>> getStationBasicInfo();

    UniResponse<List<WaterLevelStations>> getWaterLevelStations();

    UniResponse<List<WaterQualityStations>> getWaterQualityStations();
}

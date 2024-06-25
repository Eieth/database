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

    UniResponse<Boolean> insertEvaporationStation(String token, EvaporationStation evaporationStation);
    UniResponse<Boolean> deleteEvaporationStation(String token, int stationCode);
    UniResponse<Boolean> updateEvaporationStation(String token, EvaporationStation evaporationStation);

    UniResponse<Boolean> insertHistoricalChanges(String token, HistoricalChanges historicalChanges);
    UniResponse<Boolean> deleteHistoricalChanges(String token, int stationCode);
    UniResponse<Boolean> updateHistoricalChanges(String token, HistoricalChanges historicalChanges);

    UniResponse<Boolean> insertHydrologicalStations(String token, HydrologicalStations hydrologicalStations);
    UniResponse<Boolean> deleteHydrologicalStations(String token, int stationCode);
    UniResponse<Boolean> updateHydrologicalStations(String token, HydrologicalStations hydrologicalStations);

    UniResponse<Boolean> insertRainfallStations(String token, RainfallStations rainfallStations);
    UniResponse<Boolean> deleteRainfallStations(String token, int stationCode);
    UniResponse<Boolean> updateRainfallStations(String token, RainfallStations rainfallStations);

    UniResponse<Boolean> insertSoilMoistureStation(String token, SoilMoistureStation soilMoistureStation);
    UniResponse<Boolean> deleteSoilMoistureStation(String token, int stationCode);
    UniResponse<Boolean> updateSoilMoistureStation(String token, SoilMoistureStation soilMoistureStation);

    UniResponse<Boolean> insertStationBasicInfo(String token, StationBasicInfo stationBasicInfo);
    UniResponse<Boolean> deleteStationBasicInfo(String token, int stationCode);
    UniResponse<Boolean> updateStationBasicInfo(String token, StationBasicInfo stationBasicInfo);

    UniResponse<Boolean> insertWaterLevelStations(String token, WaterLevelStations waterLevelStations);
    UniResponse<Boolean> deleteWaterLevelStations(String token, int stationCode);
    UniResponse<Boolean> updateWaterLevelStations(String token, WaterLevelStations waterLevelStations);

    UniResponse<Boolean> insertWaterQualityStations(String token, WaterQualityStations waterQualityStations);
    UniResponse<Boolean> deleteWaterQualityStations(String token, int stationCode);
    UniResponse<Boolean> updateWaterQualityStations(String token, WaterQualityStations waterQualityStations);
}

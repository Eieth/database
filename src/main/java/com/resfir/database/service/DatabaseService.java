package com.resfir.database.service;

import com.resfir.database.entity.*;

import java.util.List;
import java.util.Map;

public interface DatabaseService {

    UniResponse<List<StationOverview>> getStationOverview();

    UniResponse<List<ElevationInfo>> getElevationInfo();

    UniResponse<List<StationGeographicalLocation>> getStationGeographicalLocation();

    UniResponse<List<StationAddress>> getStationAddress();

    UniResponse<List<StationBasicInfo>> getStationBasicInfo();

    UniResponse<List<HydrologicalStationCharacteristicValues>> getHydrologicalStationCharacteristicValues();

    UniResponse<List<WaterLevelStationCharacteristicValues>> getWaterLevelStationCharacteristicValues();

    UniResponse<List<RainfallStationCharacteristicValues>> getRainfallStationCharacteristicValues();

    UniResponse<List<EvaporationStationCharacteristicValues>> getEvaporationStationCharacteristicValues() ;

    UniResponse<Integer> insertStationOverview(Map<String, Object> map) ;

    UniResponse<Integer> insertStationGeographicalLocation(Map<String, Object> map);

    UniResponse<Integer> deleteStationOverview(Map<String, Object> map);
}

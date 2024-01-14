package com.resfir.database.controller;


import com.resfir.database.entity.*;
import com.resfir.database.mapper.DatabaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class DatabaseController {
    @Autowired
    DatabaseMapper databaseMapper;
    @PostMapping("/hello")
    public String hello(){
        return "hello";
    }
    @PostMapping("/api/StationOverview")
    public List<StationOverview> getStationOverview(){
        return databaseMapper.getStationOverview();
    }
    @PostMapping("/api/ElevationInfo")
    public List<ElevationInfo> getElevationInfo(){
        return databaseMapper.getElevationInfo();
    }
    @PostMapping("/api/StationGeographicalLocation")
    public List<StationGeographicalLocation> getStationGeographicalLocation(){
        return databaseMapper.getStationGeographicalLocation();
    }
    @PostMapping("/api/StationAddress")
    public List<StationAddress> getStationAddress(){
        return databaseMapper.getStationAddress();
    }
    @PostMapping("/api/StationBasicInfo")
    public List<StationBasicInfo> getStationBasicInfo(){
        return databaseMapper.getStationBasicInfo();
    }
    @PostMapping("/api/HydrologicalStationCharacteristicValues")
    public List<HydrologicalStationCharacteristicValues> getHydrologicalStationCharacteristicValues(){
        return databaseMapper.getHydrologicalStationCharacteristicValues();
    }
    @PostMapping("/api/WaterLevelStationCharacteristicValues")
    public List<WaterLevelStationCharacteristicValues> getWaterLevelStationCharacteristicValues(){
        return databaseMapper.getWaterLevelStationCharacteristicValues();
    }
    @PostMapping("/api/RainfallStationCharacteristicValues")
    public List<RainfallStationCharacteristicValues> getRainfallStationCharacteristicValues(){
        return databaseMapper.getRainfallStationCharacteristicValues();
    }
    @PostMapping("/api/EvaporationStationCharacteristicValues")
    public List<EvaporationStationCharacteristicValues> getEvaporationStationCharacteristicValues() {
        return databaseMapper.getEvaporationStationCharacteristicValues();
    }
    @PostMapping("/api/insertStationOverview")
    public int insertStationOverview(Map<String, Object> map) {
        int stationCode = (int)map.get("stationCode");
        String stationName=(String)map.get("stationName");
        String stationType=(String)map.get("stationType");
        return databaseMapper.insertIntoStationOverview(stationCode,stationName,stationType);
    }
    @PostMapping("/api/insertStationGeographicalLocation")
    public int insertStationGeographicalLocation(Map<String, Object> map){
        int i = insertStationOverview(map);
        int stationCode = (int)map.get("stationCode");
        String stationType=(String)map.get("stationType");
        float longitude = (float)map.get("longitude");
        float latitude= (float)map.get("latitude");
        if (i > 0) return databaseMapper.updateStationGeographicalLocation(stationCode,stationType,longitude,latitude);
        return 0;
    }
    @PostMapping("/api/deleteStationOverview")
    public int deleteStationOverview(Map<String, Object> map) {
        int stationCode = (int)map.get("stationCode");
        String stationName=(String)map.get("stationName");
        String stationType=(String)map.get("stationType");
        return databaseMapper.deleteStationOverview(stationCode, stationName, stationType);
    }
}

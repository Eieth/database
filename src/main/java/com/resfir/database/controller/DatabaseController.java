package com.resfir.database.controller;


import com.resfir.database.entity.*;
import com.resfir.database.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/database")
public class DatabaseController {
    private final DatabaseService databaseService;

    public DatabaseController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @PostMapping("/t")
    public int t() {
        return 1;
    }

    @PostMapping("/StationOverview")
    public UniResponse<List<StationOverview>> getStationOverview(){
        return databaseService.getStationOverview();
    }
    @PostMapping("/ElevationInfo")
    public UniResponse<List<ElevationInfo>> getElevationInfo(){
        return databaseService.getElevationInfo();
    }
    @PostMapping("/StationGeographicalLocation")
    public UniResponse<List<StationGeographicalLocation>> getStationGeographicalLocation(){
        return databaseService.getStationGeographicalLocation();
    }
    @PostMapping("/StationAddress")
    public UniResponse<List<StationAddress>> getStationAddress(){
        return databaseService.getStationAddress();
    }
    @PostMapping("/StationBasicInfo")
    public UniResponse<List<StationBasicInfo>> getStationBasicInfo(){
        return databaseService.getStationBasicInfo();
    }
    @PostMapping("/HydrologicalStationCharacteristicValues")
    public UniResponse<List<HydrologicalStationCharacteristicValues>> getHydrologicalStationCharacteristicValues(){
        return databaseService.getHydrologicalStationCharacteristicValues();
    }
    @PostMapping("/WaterLevelStationCharacteristicValues")
    public UniResponse<List<WaterLevelStationCharacteristicValues>> getWaterLevelStationCharacteristicValues(){
        return databaseService.getWaterLevelStationCharacteristicValues();
    }
    @PostMapping("/RainfallStationCharacteristicValues")
    public UniResponse<List<RainfallStationCharacteristicValues>> getRainfallStationCharacteristicValues(){
        return databaseService.getRainfallStationCharacteristicValues();
    }
    @PostMapping("/EvaporationStationCharacteristicValues")
    public UniResponse<List<EvaporationStationCharacteristicValues>> getEvaporationStationCharacteristicValues() {
        return databaseService.getEvaporationStationCharacteristicValues();
    }
    @PostMapping("/insertStationOverview")
    public UniResponse<Integer> insertStationOverview(Map<String, Object> map) {
        return databaseService.insertStationOverview(map);
    }
    @PostMapping("/insertStationGeographicalLocation")
    public UniResponse<Integer> insertStationGeographicalLocation(Map<String, Object> map){
        return databaseService.insertStationGeographicalLocation(map);
    }
    @PostMapping("/deleteStationOverview")
    public UniResponse<Integer> deleteStationOverview(Map<String, Object> map) {
        return databaseService.deleteStationOverview(map);
    }
}

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

    @PostMapping("/EvaporationStation")
    public UniResponse<List<EvaporationStation>> getEvaporationStation(){
        return databaseService.getEvaporationStation();
    }
    @PostMapping("/HistoricalChanges")
    public UniResponse<List<HistoricalChanges>> getHistoricalChanges(){
        return databaseService.getHistoricalChanges();
    }
    @PostMapping("/HydrologicalStations")
    public UniResponse<List<HydrologicalStations>> getHydrologicalStations(){
        return databaseService.getHydrologicalStations();
    }
    @PostMapping("/RainfallStations")
    public UniResponse<List<RainfallStations>> getRainfallStations(){
        return databaseService.getRainfallStations();
    }
    @PostMapping("/SoilMoistureStation")
    public UniResponse<List<SoilMoistureStation>> getSoilMoistureStation(){
        return databaseService.getSoilMoistureStation();
    }
    @PostMapping("/StationBasicInfo")
    public UniResponse<List<StationBasicInfo>> getStationBasicInfo(){
        return databaseService.getStationBasicInfo();
    }
    @PostMapping("/WaterLevelStations")
    public UniResponse<List<WaterLevelStations>> getWaterLevelStations(){
        return databaseService.getWaterLevelStations();
    }
    @PostMapping("/WaterQualityStations")
    public UniResponse<List<WaterQualityStations>> getWaterQualityStations(){
        return databaseService.getWaterQualityStations();
    }
}

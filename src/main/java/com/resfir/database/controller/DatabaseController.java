package com.resfir.database.controller;


import com.resfir.database.entity.*;
import com.resfir.database.service.DatabaseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/database")
@Tag(name = "数据库控制服务")
public class DatabaseController {
    private final DatabaseService databaseService;

    public DatabaseController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @Operation(summary = "查询DynamicInfo表")
    @PostMapping("/getDynamicInfo")
    public UniResponse<List<DynamicInfo>> getDynamicInfo(){
        return databaseService.getDynamicInfo();
    }

    @Operation(summary = "查询EvaporationStation表")
    @PostMapping("/getEvaporationStation")
    public UniResponse<List<EvaporationStation>> getEvaporationStation(){
        return databaseService.getEvaporationStation();
    }
    @Operation(summary = "查询HistoricalChanges表")
    @PostMapping("/getHistoricalChanges")
    public UniResponse<List<HistoricalChanges>> getHistoricalChanges(){
        return databaseService.getHistoricalChanges();
    }
    @Operation(summary = "查询HydrologicalStations表")
    @PostMapping("/getHydrologicalStations")
    public UniResponse<List<HydrologicalStations>> getHydrologicalStations(){
        return databaseService.getHydrologicalStations();
    }
    @Operation(summary = "查询RainfallStations表")
    @PostMapping("/getRainfallStations")
    public UniResponse<List<RainfallStations>> getRainfallStations(){
        return databaseService.getRainfallStations();
    }
    @Operation(summary = "查询SoilMoistureStation表")
    @PostMapping("/getSoilMoistureStation")
    public UniResponse<List<SoilMoistureStation>> getSoilMoistureStation(){
        return databaseService.getSoilMoistureStation();
    }
    @Operation(summary = "查询StationBasicInfo表")
    @PostMapping("/getStationBasicInfo")
    public UniResponse<List<StationBasicInfo>> getStationBasicInfo(){
        return databaseService.getStationBasicInfo();
    }
    @Operation(summary = "查询WaterLevelStations表")
    @PostMapping("/getWaterLevelStations")
    public UniResponse<List<WaterLevelStations>> getWaterLevelStations(){
        return databaseService.getWaterLevelStations();
    }
    @Operation(summary = "查询WaterQualityStations表")
    @PostMapping("/getWaterQualityStations")
    public UniResponse<List<WaterQualityStations>> getWaterQualityStations(){
        return databaseService.getWaterQualityStations();
    }

    @Operation(summary = "插入DynamicInfo表")
    @PostMapping("/insertDynamicInfo")
    public UniResponse<Boolean> insertDynamicInfo(HttpServletRequest request, @RequestBody DynamicInfo dynamicInfo){
        String token = request.getHeader("token");
        return databaseService.insertDynamicInfo(token, dynamicInfo);
    }

    @Operation(summary = "插入EvaporationStation表")
    @PostMapping("/insertEvaporationStation")
    public UniResponse<Boolean> insertEvaporationStation(HttpServletRequest request, @RequestBody EvaporationStation evaporationStation){
        String token = request.getHeader("token");
        return databaseService.insertEvaporationStation(token, evaporationStation);
    }
    @Operation(summary = "插入HistoricalChanges表")
    @PostMapping("/insertHistoricalChanges")
    public UniResponse<InsertTableResponse> insertHistoricalChanges(HttpServletRequest request, @RequestBody HistoricalChanges historicalChanges){
        String token = request.getHeader("token");
        return databaseService.insertHistoricalChanges(token, historicalChanges);
    }
    @Operation(summary = "插入HydrologicalStations表")
    @PostMapping("/insertHydrologicalStations")
    public UniResponse<Boolean> insertHydrologicalStations(HttpServletRequest request, @RequestBody HydrologicalStations hydrologicalStations){
        String token = request.getHeader("token");
        return databaseService.insertHydrologicalStations(token, hydrologicalStations);
    }
    @Operation(summary = "插入RainfallStations表")
    @PostMapping("/insertRainfallStations")
    public UniResponse<Boolean> insertRainfallStations(HttpServletRequest request, @RequestBody RainfallStations rainfallStations){
        String token = request.getHeader("token");
        return databaseService.insertRainfallStations(token, rainfallStations);
    }
    @Operation(summary = "插入SoilMoistureStation表")
    @PostMapping("/insertSoilMoistureStation")
    public UniResponse<Boolean> insertSoilMoistureStation(HttpServletRequest request, @RequestBody SoilMoistureStation soilMoistureStation){
        String token = request.getHeader("token");
        return databaseService.insertSoilMoistureStation(token, soilMoistureStation);
    }
    @Operation(summary = "插入StationBasicInfo表")
    @PostMapping("/insertStationBasicInfo")
    public UniResponse<Boolean> insertStationBasicInfo(HttpServletRequest request, @RequestBody StationBasicInfo stationBasicInfo){
        String token = request.getHeader("token");
        return databaseService.insertStationBasicInfo(token, stationBasicInfo);
    }
    @Operation(summary = "插入WaterLevelStations表")
    @PostMapping("/insertWaterLevelStations")
    public UniResponse<Boolean> insertWaterLevelStations(HttpServletRequest request, @RequestBody WaterLevelStations waterLevelStations){
        String token = request.getHeader("token");
        return databaseService.insertWaterLevelStations(token, waterLevelStations);
    }
    @Operation(summary = "插入WaterQualityStations表")
    @PostMapping("/insertWaterQualityStations")
    public UniResponse<Boolean> insertWaterQualityStations(HttpServletRequest request, @RequestBody WaterQualityStations waterQualityStations){
        String token = request.getHeader("token");
        return databaseService.insertWaterQualityStations(token, waterQualityStations);
    }

    @Operation(summary = "删除记录在DynamicInfo表")
    @PostMapping("/deleteDynamicInfo")
    public UniResponse<Boolean> deleteDynamicInfo(HttpServletRequest request, @RequestBody int stationCode){
        String token = request.getHeader("token");
        return databaseService.deleteDynamicInfo(token, stationCode);
    }

    @Operation(summary = "删除记录在EvaporationStation表")
    @PostMapping("/deleteEvaporationStation")
    public UniResponse<Boolean> deleteEvaporationStation(HttpServletRequest request, @RequestBody int stationCode){
        String token = request.getHeader("token");
        return databaseService.deleteEvaporationStation(token, stationCode);
    }
    @Operation(summary = "删除记录在HistoricalChanges表")
    @PostMapping("/deleteHistoricalChanges")
    public UniResponse<Boolean> deleteHistoricalChanges(HttpServletRequest request, @RequestBody int stationCode){
        String token = request.getHeader("token");
        return databaseService.deleteHistoricalChanges(token, stationCode);
    }
    @Operation(summary = "删除记录在HydrologicalStations表")
    @PostMapping("/deleteHydrologicalStations")
    public UniResponse<Boolean> deleteHydrologicalStations(HttpServletRequest request, @RequestBody int stationCode){
        String token = request.getHeader("token");
        return databaseService.deleteHydrologicalStations(token, stationCode);
    }
    @Operation(summary = "删除记录在RainfallStations表")
    @PostMapping("/deleteRainfallStations")
    public UniResponse<Boolean> deleteRainfallStations(HttpServletRequest request, @RequestBody int stationCode){
        String token = request.getHeader("token");
        return databaseService.deleteRainfallStations(token, stationCode);
    }
    @Operation(summary = "删除记录在SoilMoistureStation表")
    @PostMapping("/deleteSoilMoistureStation")
    public UniResponse<Boolean> deleteSoilMoistureStation(HttpServletRequest request, @RequestBody int stationCode){
        String token = request.getHeader("token");
        return databaseService.deleteSoilMoistureStation(token, stationCode);
    }
    @Operation(summary = "删除记录在StationBasicInfo表")
    @PostMapping("/deleteStationBasicInfo")
    public UniResponse<Boolean> deleteStationBasicInfo(HttpServletRequest request, @RequestBody int stationCode){
        String token = request.getHeader("token");
        return databaseService.deleteStationBasicInfo(token, stationCode);
    }
    @Operation(summary = "删除记录在WaterLevelStations表")
    @PostMapping("/deleteWaterLevelStations")
    public UniResponse<Boolean> deleteWaterLevelStations(HttpServletRequest request, @RequestBody int stationCode){
        String token = request.getHeader("token");
        return databaseService.deleteWaterLevelStations(token, stationCode);
    }
    @Operation(summary = "删除记录在WaterQualityStations表")
    @PostMapping("/deleteWaterQualityStations")
    public UniResponse<Boolean> deleteWaterQualityStations(HttpServletRequest request, @RequestBody int stationCode){
        String token = request.getHeader("token");
        return databaseService.deleteWaterQualityStations(token, stationCode);
    }

    @Operation(summary = "更新记录在DynamicInfo表")
    @PostMapping("/updateDynamicInfo")
    public UniResponse<Boolean> updateDynamicInfo(HttpServletRequest request, @RequestBody DynamicInfo dynamicInfo){
        String token = request.getHeader("token");
        return databaseService.updateDynamicInfo(token, dynamicInfo);
    }

    @Operation(summary = "更新记录在EvaporationStation表")
    @PostMapping("/updateEvaporationStation")
    public UniResponse<Boolean> updateEvaporationStation(HttpServletRequest request, @RequestBody EvaporationStation evaporationStation){
        String token = request.getHeader("token");
        return databaseService.updateEvaporationStation(token, evaporationStation);
    }
    @Operation(summary = "更新记录在HistoricalChanges表")
    @PostMapping("/updateHistoricalChanges")
    public UniResponse<Boolean> updateHistoricalChanges(HttpServletRequest request, @RequestBody HistoricalChanges historicalChanges){
        String token = request.getHeader("token");
        return databaseService.updateHistoricalChanges(token, historicalChanges);
    }
    @Operation(summary = "更新记录在HydrologicalStations表")
    @PostMapping("/updateHydrologicalStations")
    public UniResponse<Boolean> updateHydrologicalStations(HttpServletRequest request, @RequestBody HydrologicalStations hydrologicalStations){
        String token = request.getHeader("token");
        return databaseService.updateHydrologicalStations(token, hydrologicalStations);
    }
    @Operation(summary = "更新记录在RainfallStations表")
    @PostMapping("/updateRainfallStations")
    public UniResponse<Boolean> updateRainfallStations(HttpServletRequest request, @RequestBody RainfallStations rainfallStations){
        String token = request.getHeader("token");
        return databaseService.updateRainfallStations(token, rainfallStations);
    }
    @Operation(summary = "更新记录在SoilMoistureStation表")
    @PostMapping("/updateSoilMoistureStation")
    public UniResponse<Boolean> updateSoilMoistureStation(HttpServletRequest request, @RequestBody SoilMoistureStation soilMoistureStation){
        String token = request.getHeader("token");
        return databaseService.updateSoilMoistureStation(token, soilMoistureStation);
    }
    @Operation(summary = "更新记录在StationBasicInfo表")
    @PostMapping("/updateStationBasicInfo")
    public UniResponse<Boolean> updateStationBasicInfo(HttpServletRequest request, @RequestBody StationBasicInfo stationBasicInfo){
        String token = request.getHeader("token");
        return databaseService.updateStationBasicInfo(token, stationBasicInfo);
    }
    @Operation(summary = "更新记录在WaterLevelStations表")
    @PostMapping("/updateWaterLevelStations")
    public UniResponse<Boolean> updateWaterLevelStations(HttpServletRequest request, @RequestBody WaterLevelStations waterLevelStations){
        String token = request.getHeader("token");
        return databaseService.updateWaterLevelStations(token, waterLevelStations);
    }
    @Operation(summary = "更新记录在WaterQualityStations表")
    @PostMapping("/updateWaterQualityStations")
    public UniResponse<Boolean> updateWaterQualityStations(HttpServletRequest request, @RequestBody WaterQualityStations waterQualityStations){
        String token = request.getHeader("token");
        return databaseService.updateWaterQualityStations(token, waterQualityStations);
    }
}

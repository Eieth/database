package com.resfir.database.service.Impl;

import com.resfir.database.entity.*;
import com.resfir.database.mapper.*;
import com.resfir.database.service.DatabaseService;
import org.springframework.stereotype.Service;


import java.util.List;

import static com.resfir.database.entity.DefaultStatus.FAILURE;
import static com.resfir.database.entity.DefaultStatus.SUCCESS;
@Service
public class DatabaseImpl implements DatabaseService {
    
    private final EvaporationStationMapper evaporationStationMapper;
    private final HistoricalChangesMapper historicalChangesMapper;
    private final HydrologicalStationsMapper hydrologicalStationsMapper;
    private final RainfallStationsMapper rainfallStationsMapper;
    private final SoilMoistureStationMapper soilMoistureStationMapper;
    private final StationBasicInfoMapper stationBasicInfoMapper;
    private final WaterLevelStationsMapper waterLevelStationsMapper;
    private final WaterQualityStationsMapper waterQualityStationsMapper;

    public DatabaseImpl(EvaporationStationMapper evaporationStationMapper, HistoricalChangesMapper historicalChangesMapper, HydrologicalStationsMapper hydrologicalStationsMapper, RainfallStationsMapper rainfallStationsMapper, SoilMoistureStationMapper soilMoistureStationMapper, StationBasicInfoMapper stationBasicInfoMapper, WaterLevelStationsMapper waterLevelStationsMapper, WaterQualityStationsMapper waterQualityStationsMapper) {
        this.evaporationStationMapper = evaporationStationMapper;
        this.historicalChangesMapper = historicalChangesMapper;
        this.hydrologicalStationsMapper = hydrologicalStationsMapper;
        this.rainfallStationsMapper = rainfallStationsMapper;
        this.soilMoistureStationMapper = soilMoistureStationMapper;
        this.stationBasicInfoMapper = stationBasicInfoMapper;
        this.waterLevelStationsMapper = waterLevelStationsMapper;
        this.waterQualityStationsMapper = waterQualityStationsMapper;
    }


    public UniResponse<List<EvaporationStation>> getEvaporationStation(){
        UniResponse<List<EvaporationStation>> response = new UniResponse<>();
        List<EvaporationStation> data = evaporationStationMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }


    public UniResponse<List<HistoricalChanges>> getHistoricalChanges(){
        UniResponse<List<HistoricalChanges>> response = new UniResponse<>();
        List<HistoricalChanges> data = historicalChangesMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<List<HydrologicalStations>> getHydrologicalStations(){
        UniResponse<List<HydrologicalStations>> response = new UniResponse<>();
        List<HydrologicalStations> data = hydrologicalStationsMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<List<RainfallStations>> getRainfallStations(){
        UniResponse<List<RainfallStations>> response = new UniResponse<>();
        List<RainfallStations> data =  rainfallStationsMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<List<SoilMoistureStation>> getSoilMoistureStation(){
        UniResponse<List<SoilMoistureStation>> response = new UniResponse<>();
        List<SoilMoistureStation> data = soilMoistureStationMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<List<StationBasicInfo>> getStationBasicInfo(){
        UniResponse<List<StationBasicInfo>> response = new UniResponse<>();
        List<StationBasicInfo> data = stationBasicInfoMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<List<WaterLevelStations>> getWaterLevelStations(){
        UniResponse<List<WaterLevelStations>> response = new UniResponse<>();
        List<WaterLevelStations> data = waterLevelStationsMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<List<WaterQualityStations>> getWaterQualityStations() {
        UniResponse<List<WaterQualityStations>> response = new UniResponse<>();
        List<WaterQualityStations> data = waterQualityStationsMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }
}

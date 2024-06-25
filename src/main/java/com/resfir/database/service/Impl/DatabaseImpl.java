package com.resfir.database.service.Impl;

import com.resfir.database.entity.*;
import com.resfir.database.mapper.*;
import com.resfir.database.service.DatabaseService;
import com.resfir.database.service.UserService;
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
    private final UserService userService;

    public DatabaseImpl(EvaporationStationMapper evaporationStationMapper, HistoricalChangesMapper historicalChangesMapper, HydrologicalStationsMapper hydrologicalStationsMapper, RainfallStationsMapper rainfallStationsMapper, SoilMoistureStationMapper soilMoistureStationMapper, StationBasicInfoMapper stationBasicInfoMapper, WaterLevelStationsMapper waterLevelStationsMapper, WaterQualityStationsMapper waterQualityStationsMapper, UserService userService) {
        this.evaporationStationMapper = evaporationStationMapper;
        this.historicalChangesMapper = historicalChangesMapper;
        this.hydrologicalStationsMapper = hydrologicalStationsMapper;
        this.rainfallStationsMapper = rainfallStationsMapper;
        this.soilMoistureStationMapper = soilMoistureStationMapper;
        this.stationBasicInfoMapper = stationBasicInfoMapper;
        this.waterLevelStationsMapper = waterLevelStationsMapper;
        this.waterQualityStationsMapper = waterQualityStationsMapper;
        this.userService = userService;
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

    private UniResponse<Boolean> getBooleanUniResponse(int result) {
        UniResponse<Boolean> response = new UniResponse<>();
        if (result != 1) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(true);
        }
        return response;
    }

    public UniResponse<Boolean> insertEvaporationStation(String token, EvaporationStation evaporationStation) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(evaporationStationMapper.insert(evaporationStation));
    }

    public UniResponse<Boolean> deleteEvaporationStation(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(evaporationStationMapper.deleteById(stationCode));
    }

    public UniResponse<Boolean> updateEvaporationStation(String token, EvaporationStation evaporationStation) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(evaporationStationMapper.updateById(evaporationStation));
    }

    public UniResponse<Boolean> insertHistoricalChanges(String token, HistoricalChanges historicalChanges) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(historicalChangesMapper.insert(historicalChanges));
    }

    public UniResponse<Boolean> deleteHistoricalChanges(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(historicalChangesMapper.deleteById(stationCode));
    }

    public UniResponse<Boolean> updateHistoricalChanges(String token, HistoricalChanges historicalChanges) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(historicalChangesMapper.updateById(historicalChanges));
    }
    public UniResponse<Boolean> insertHydrologicalStations(String token, HydrologicalStations hydrologicalStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(hydrologicalStationsMapper.insert(hydrologicalStations));
    }

    public UniResponse<Boolean> deleteHydrologicalStations(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(hydrologicalStationsMapper.deleteById(stationCode));
    }

    public UniResponse<Boolean> updateHydrologicalStations(String token, HydrologicalStations hydrologicalStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(hydrologicalStationsMapper.updateById(hydrologicalStations));
    }
    public UniResponse<Boolean> insertRainfallStations(String token, RainfallStations rainfallStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(rainfallStationsMapper.insert(rainfallStations));
    }

    public UniResponse<Boolean> deleteRainfallStations(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(rainfallStationsMapper.deleteById(stationCode));
    }

    public UniResponse<Boolean> updateRainfallStations(String token, RainfallStations rainfallStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(rainfallStationsMapper.updateById(rainfallStations));
    }
    public UniResponse<Boolean> insertSoilMoistureStation(String token, SoilMoistureStation soilMoistureStation) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(soilMoistureStationMapper.insert(soilMoistureStation));
    }

    public UniResponse<Boolean> deleteSoilMoistureStation(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(soilMoistureStationMapper.deleteById(stationCode));
    }

    public UniResponse<Boolean> updateSoilMoistureStation(String token, SoilMoistureStation soilMoistureStation) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(soilMoistureStationMapper.updateById(soilMoistureStation));
    }
    public UniResponse<Boolean> insertStationBasicInfo(String token, StationBasicInfo stationBasicInfo) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(stationBasicInfoMapper.insert(stationBasicInfo));
    }

    public UniResponse<Boolean> deleteStationBasicInfo(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(stationBasicInfoMapper.deleteById(stationCode));
    }

    public UniResponse<Boolean> updateStationBasicInfo(String token, StationBasicInfo stationBasicInfo) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(stationBasicInfoMapper.updateById(stationBasicInfo));
    }
    public UniResponse<Boolean> insertWaterLevelStations(String token, WaterLevelStations waterLevelStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(waterLevelStationsMapper.insert(waterLevelStations));
    }

    public UniResponse<Boolean> deleteWaterLevelStations(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(waterLevelStationsMapper.deleteById(stationCode));
    }

    public UniResponse<Boolean> updateWaterLevelStations(String token, WaterLevelStations waterLevelStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(waterLevelStationsMapper.updateById(waterLevelStations));
    }
    public UniResponse<Boolean> insertWaterQualityStations(String token, WaterQualityStations waterQualityStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(waterQualityStationsMapper.insert(waterQualityStations));
    }

    public UniResponse<Boolean> deleteWaterQualityStations(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(waterQualityStationsMapper.deleteById(stationCode));
    }

    public UniResponse<Boolean> updateWaterQualityStations(String token, WaterQualityStations waterQualityStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE);
        }
        return getBooleanUniResponse(waterQualityStationsMapper.updateById(waterQualityStations));
    }
}

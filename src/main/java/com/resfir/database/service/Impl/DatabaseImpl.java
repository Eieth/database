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
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(evaporationStationMapper.insert(evaporationStation));
        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> deleteEvaporationStation(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(evaporationStationMapper.deleteById(stationCode));
        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> updateEvaporationStation(String token, EvaporationStation evaporationStation) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(evaporationStationMapper.updateById(evaporationStation));
        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<InsertTableResponse> insertHistoricalChanges(String token, HistoricalChanges historicalChanges) {
        System.out.println(historicalChanges);

        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            int i = historicalChangesMapper.insert(historicalChanges);
            if (i != 1) {
                throw (new Exception("插入失败"));
            }
            return UniResponse.with(SUCCESS, "插入成功", new InsertTableResponse(historicalChanges.getId(), true));
        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> deleteHistoricalChanges(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(historicalChangesMapper.deleteById(stationCode));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> updateHistoricalChanges(String token, HistoricalChanges historicalChanges) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(historicalChangesMapper.updateById(historicalChanges));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }
    public UniResponse<Boolean> insertHydrologicalStations(String token, HydrologicalStations hydrologicalStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(hydrologicalStationsMapper.insert(hydrologicalStations));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> deleteHydrologicalStations(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(hydrologicalStationsMapper.deleteById(stationCode));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> updateHydrologicalStations(String token, HydrologicalStations hydrologicalStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(hydrologicalStationsMapper.updateById(hydrologicalStations));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }
    public UniResponse<Boolean> insertRainfallStations(String token, RainfallStations rainfallStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(rainfallStationsMapper.insert(rainfallStations));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> deleteRainfallStations(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(rainfallStationsMapper.deleteById(stationCode));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> updateRainfallStations(String token, RainfallStations rainfallStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(rainfallStationsMapper.updateById(rainfallStations));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }
    public UniResponse<Boolean> insertSoilMoistureStation(String token, SoilMoistureStation soilMoistureStation) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(soilMoistureStationMapper.insert(soilMoistureStation));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> deleteSoilMoistureStation(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(soilMoistureStationMapper.deleteById(stationCode));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> updateSoilMoistureStation(String token, SoilMoistureStation soilMoistureStation) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(soilMoistureStationMapper.updateById(soilMoistureStation));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }
    public UniResponse<Boolean> insertStationBasicInfo(String token, StationBasicInfo stationBasicInfo) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(stationBasicInfoMapper.insert(stationBasicInfo));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> deleteStationBasicInfo(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(stationBasicInfoMapper.deleteById(stationCode));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> updateStationBasicInfo(String token, StationBasicInfo stationBasicInfo) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(stationBasicInfoMapper.updateById(stationBasicInfo));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }
    public UniResponse<Boolean> insertWaterLevelStations(String token, WaterLevelStations waterLevelStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(waterLevelStationsMapper.insert(waterLevelStations));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> deleteWaterLevelStations(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(waterLevelStationsMapper.deleteById(stationCode));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> updateWaterLevelStations(String token, WaterLevelStations waterLevelStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(waterLevelStationsMapper.updateById(waterLevelStations));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }
    public UniResponse<Boolean> insertWaterQualityStations(String token, WaterQualityStations waterQualityStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(waterQualityStationsMapper.insert(waterQualityStations));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> deleteWaterQualityStations(String token, int stationCode) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(waterQualityStationsMapper.deleteById(stationCode));

        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }

    public UniResponse<Boolean> updateWaterQualityStations(String token, WaterQualityStations waterQualityStations) {
        if (userService.getUserLevelByToken(token) == Level.DEFAULT.getCode()) {
            return UniResponse.with(FAILURE, "用户权限不足");
        }
        try {
            return getBooleanUniResponse(waterQualityStationsMapper.updateById(waterQualityStations));
        } catch (Exception e) {
            return UniResponse.with(FAILURE, e.getMessage());
        }
    }
}

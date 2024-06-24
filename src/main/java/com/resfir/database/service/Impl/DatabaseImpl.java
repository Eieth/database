package com.resfir.database.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.resfir.database.entity.*;
import com.resfir.database.mapper.*;
import com.resfir.database.service.DatabaseService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

import static com.resfir.database.entity.DefaultStatus.FAILURE;
import static com.resfir.database.entity.DefaultStatus.SUCCESS;
@Service
public class DatabaseImpl implements DatabaseService {

    private final ElevationInfoMapper elevationInfoMapper;
    private final EvaporationStationCharacteristicValuesMapper evaporationStationCharacteristicValuesMapper;
    private final HydrologicalStationCharacteristicValuesMapper hydrologicalStationCharacteristicValuesMapper;
    private final RainfallStationCharacteristicValuesMapper rainfallStationCharacteristicValuesMapper;
    private final StationAddressMapper stationAddressMapper;
    private final StationBasicInfoMapper stationBasicInfoMapper;
    private final StationGeographicalLocationMapper stationGeographicalLocationMapper;
    private final StationOverviewMapper stationOverviewMapper;
    private final WaterLevelStationCharacteristicValuesMapper waterLevelStationCharacteristicValuesMapper;

    public DatabaseImpl(ElevationInfoMapper elevationInfoMapper, EvaporationStationCharacteristicValuesMapper evaporationStationCharacteristicValuesMapper, HydrologicalStationCharacteristicValuesMapper hydrologicalStationCharacteristicValuesMapper, RainfallStationCharacteristicValuesMapper rainfallStationCharacteristicValuesMapper, StationAddressMapper stationAddressMapper, StationBasicInfoMapper stationBasicInfoMapper, StationGeographicalLocationMapper stationGeographicalLocationMapper, StationOverviewMapper stationOverviewMapper, WaterLevelStationCharacteristicValuesMapper waterLevelStationCharacteristicValuesMapper) {
        this.elevationInfoMapper = elevationInfoMapper;
        this.evaporationStationCharacteristicValuesMapper = evaporationStationCharacteristicValuesMapper;
        this.hydrologicalStationCharacteristicValuesMapper = hydrologicalStationCharacteristicValuesMapper;
        this.rainfallStationCharacteristicValuesMapper = rainfallStationCharacteristicValuesMapper;
        this.stationAddressMapper = stationAddressMapper;
        this.stationBasicInfoMapper = stationBasicInfoMapper;
        this.stationGeographicalLocationMapper = stationGeographicalLocationMapper;
        this.stationOverviewMapper = stationOverviewMapper;
        this.waterLevelStationCharacteristicValuesMapper = waterLevelStationCharacteristicValuesMapper;
    }

    public UniResponse<List<StationOverview>> getStationOverview(){
        UniResponse<List<StationOverview>> response = new UniResponse<>();
        List<StationOverview> data = stationOverviewMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<List<ElevationInfo>> getElevationInfo(){
        UniResponse<List<ElevationInfo>> response = new UniResponse<>();
        List<ElevationInfo> data = elevationInfoMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }


    public UniResponse<List<StationGeographicalLocation>> getStationGeographicalLocation(){
        UniResponse<List<StationGeographicalLocation>> response = new UniResponse<>();
        List<StationGeographicalLocation> data = stationGeographicalLocationMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<List<StationAddress>> getStationAddress(){
        UniResponse<List<StationAddress>> response = new UniResponse<>();
        List<StationAddress> data = stationAddressMapper.selectList(null);
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


    public UniResponse<List<HydrologicalStationCharacteristicValues>> getHydrologicalStationCharacteristicValues(){
        UniResponse<List<HydrologicalStationCharacteristicValues>> response = new UniResponse<>();
        List<HydrologicalStationCharacteristicValues> data =  hydrologicalStationCharacteristicValuesMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<List<WaterLevelStationCharacteristicValues>> getWaterLevelStationCharacteristicValues(){
        UniResponse<List<WaterLevelStationCharacteristicValues>> response = new UniResponse<>();
        List<WaterLevelStationCharacteristicValues> data = waterLevelStationCharacteristicValuesMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<List<RainfallStationCharacteristicValues>> getRainfallStationCharacteristicValues(){
        UniResponse<List<RainfallStationCharacteristicValues>> response = new UniResponse<>();
        List<RainfallStationCharacteristicValues> data = rainfallStationCharacteristicValuesMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<List<EvaporationStationCharacteristicValues>> getEvaporationStationCharacteristicValues() {
        UniResponse<List<EvaporationStationCharacteristicValues>> response = new UniResponse<>();
        List<EvaporationStationCharacteristicValues> data = evaporationStationCharacteristicValuesMapper.selectList(null);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    public UniResponse<Integer> insertStationOverview(Map<String, Object> map) {
        UniResponse<Integer> response = new UniResponse<>();
        int stationCode = (int)map.get("stationCode");
        String stationName=(String)map.get("stationName");
        String stationType=(String)map.get("stationType");
        try {
            stationOverviewMapper.insert(new StationOverview(stationCode,stationName,stationType));
        } catch (Exception e) {
            response.setCode(FAILURE);
            response.setMessage(e.getMessage());
            return response;
        }

        response.setCode(SUCCESS);
        return response;
    }

    public UniResponse<Integer> insertStationGeographicalLocation(Map<String, Object> map){
        UniResponse<Integer> response = new UniResponse<>();
        if (insertStationOverview(map).getCode().equals(FAILURE)) {
            response.setCode(FAILURE);
            return response;
        }
        int stationCode = (int)map.get("stationCode");
        String stationType=(String)map.get("stationType");
        float longitude = (float)map.get("longitude");
        float latitude= (float)map.get("latitude");

        try {
            stationGeographicalLocationMapper.insert(new StationGeographicalLocation(stationCode,stationType,longitude,latitude));
        } catch (Exception e) {
            response.setCode(FAILURE);
            response.setMessage(e.getMessage());
            return response;
        }

        response.setCode(SUCCESS);
        return response;
    }

    public UniResponse<Integer> deleteStationOverview(Map<String, Object> map) {
        UniResponse<Integer> response = new UniResponse<>();
        int stationCode = (int)map.get("stationCode");
        String stationName=(String)map.get("stationName");
        String stationType=(String)map.get("stationType");
        try {
            QueryWrapper<StationOverview> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("stationCode", stationCode)
                    .eq("stationName", stationName)
                    .eq("stationType", stationType);
            stationOverviewMapper.delete(queryWrapper);
        } catch (Exception e) {
            response.setCode(FAILURE);
            response.setMessage(e.getMessage());
            return response;
        }

        response.setCode(SUCCESS);
        return response;
    }
}

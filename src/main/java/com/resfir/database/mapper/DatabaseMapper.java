package com.resfir.database.mapper;

import com.resfir.database.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DatabaseMapper {
    @Select("select * from StationOverview")
    List<StationOverview> getStationOverview();
    @Select("select * from ElevationInfo")
    List<ElevationInfo> getElevationInfo();
    @Select("select * from StationGeographicalLocation")
    List<StationGeographicalLocation> getStationGeographicalLocation();
    @Select("select * from StationAddress")
    List<StationAddress> getStationAddress();
    @Select("select * from StationBasicInfo")
    List<StationBasicInfo> getStationBasicInfo();
    @Select("select * from HydrologicalStationCharacteristicValues")
    List<HydrologicalStationCharacteristicValues> getHydrologicalStationCharacteristicValues();
    @Select("select * from WaterLevelStationCharacteristicValues")
    List<WaterLevelStationCharacteristicValues> getWaterLevelStationCharacteristicValues();
    @Select("select * from RainfallStationCharacteristicValues")
    List<RainfallStationCharacteristicValues> getRainfallStationCharacteristicValues();
    @Select("select * from EvaporationStationCharacteristicValues")
    List<EvaporationStationCharacteristicValues> getEvaporationStationCharacteristicValues();

    @Insert("insert into StationOverview values (#{stationCode}, #{stationName}, #{stationType})")
    int insertIntoStationOverview(int stationCode, String stationName, String stationType);

    @Update("update updateStationGeographicalLocation set longitude = #{longitude}, latitude = #{latitude} where stationCode = #{stationCode} and stationType = #{stationType}")
    int updateStationGeographicalLocation(int stationCode, String stationType, float longitude, float latitude);

    @Delete("delete from StationOverview where stationCode=#{stationCode} and stationName=#{stationName} and stationType=#{stationType}")
    int deleteStationOverview(int stationCode, String stationName, String stationType);
}

package com.resfir.database.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class RainfallStations {
    @TableId(type = IdType.AUTO)
    private int stationCode;
    private String stationName;
    private String watershedDistrict;
    private String drainageSystem;
    private float vesselHeight;
    private float averageRainfall;
    private float maximumRainfall;
    private String manageUnit;
    private String appearYear;
    private String note;
}

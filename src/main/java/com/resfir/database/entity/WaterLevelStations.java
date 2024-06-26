package com.resfir.database.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class WaterLevelStations {
    @TableId(type = IdType.AUTO)
    private Integer stationCode;
    private String stationName;
    private String stationManagement;
    private String stationFeature;
    private String buildUnit;
    private String surveyTeam;
    private float actualHighestLevel;
    private String actualHighestTime;
    private float actualLowestLevel;
    private String actualLowestTime;
    private String firstDryTime;
    private int averageDryDay;
    private String note;
}

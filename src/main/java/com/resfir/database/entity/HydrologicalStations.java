package com.resfir.database.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class HydrologicalStations {
    @TableId(type = IdType.AUTO)
    private Integer stationCode;
    private String stationName;
    private String stationManagement;
    private String stationFeature;
    private String stationClassify;
    private float stationHeight;
    private String baseName;
    private String baseAmendment;
    private String surveyTeam;
    private String buildUnit;
    private float averageFlowRate;
    private float actualMaximumFlowRate;
    private String actualMaximumFlowRateTime;
    private float actualMinimalFlowRate;
    private String actualMinimalFlowRateTime;
    private String note;
}

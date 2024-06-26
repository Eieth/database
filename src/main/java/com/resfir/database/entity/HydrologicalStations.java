package com.resfir.database.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class HydrologicalStations {
    @TableId(type = IdType.AUTO)
    private Integer stationCode;
    private String stationName;
    private String watershedDistrict;
    private String drainageSystem;
    private String river;
    private int square;
    private String stationManage;
    private String stationFeature;
    private String setDate;
    private String stationAddress;
    private String stationClassify;
    private float stationHeight;
    private String baseName;
    private String baseAmendment;
    private String surveyTeam;
    private String buildUnit;
    private float averageFlowRate;
    private float actualMaximumFlowRate;
    private String actualMaximumFlowTime;
    private float actualMinimalFlowRate;
    private String actualMinimalFlowTime;
    private String manageUnit;
    private String longitude;
    private String latitude;
    private String note;
}

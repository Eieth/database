package com.resfir.database.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class WaterQualityStations {
    @TableId(type = IdType.AUTO)
    private Integer stationCode;
    private String stationName;
    private String sectionName;
    private String watershedDistrict;
    private String drainageSystem;
    private String river;
    private String setDate;
    private String primaryZoneName;
    private String secondaryZoneName;
    private String stationAddress;
    private String manageUnit;
    private String longitude;
    private String latitude;
}

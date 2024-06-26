package com.resfir.database.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class StationBasicInfo {
    @TableId(type = IdType.AUTO)
    private Integer stationCode;
    private String stationName;
    private int stationFeatureCode;
}

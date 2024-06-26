package com.resfir.database.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class DynamicInfo {
    @TableId(type = IdType.INPUT)
    private Integer stationCode;
    private String stationName;
    private int square;
}

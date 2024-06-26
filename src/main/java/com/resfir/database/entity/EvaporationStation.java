package com.resfir.database.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class EvaporationStation {
    @TableId(type = IdType.INPUT)
    private Integer stationCode;
    private String stationName;
    private float averageEvaporation;
    private String evaporatorModel;
    private String note;
}

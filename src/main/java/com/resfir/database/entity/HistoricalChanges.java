package com.resfir.database.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class HistoricalChanges {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer stationCode;
    private String stationName;
    private String setDate;
    private String changeDate;
    private String approvalAuthority;
    private int changeSituation;
    private String changeReason;
    private String stationManage;
    private String stationFeature;
    private String stationAddress;
    private String note;
}

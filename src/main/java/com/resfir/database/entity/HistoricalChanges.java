package com.resfir.database.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class HistoricalChanges {
    @TableId(type = IdType.AUTO)
    private int stationCode;
    private String stationName;
    private String watershedDistrict;
    private String drainageSystem;
    private String river;
    private int square;
    private String approvalAuthority;
    private String changeSituation;
    private String changeReason;
    private String stationManage;
    private String stationFeature;
    private String setDate;
    private String changeDate;
    private String stationAddress;
    private String manageUnit;
    private String longitude;
    private String latitude;
    private String note;
}

package com.resfir.database.entity;

import lombok.Data;

@Data
public class HistoricalChanges {
    private String stationName;
    private int stationCode;
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

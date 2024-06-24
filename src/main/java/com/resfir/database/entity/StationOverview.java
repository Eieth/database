package com.resfir.database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StationOverview {
    private int stationCode;
    private String stationName;
    private String stationType;
}

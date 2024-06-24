package com.resfir.database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StationGeographicalLocation {
    private int stationCode;
    private String stationType;
    private float longitude;
    private float latitude;
}

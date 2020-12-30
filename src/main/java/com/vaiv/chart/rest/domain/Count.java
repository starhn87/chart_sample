package com.vaiv.chart.rest.domain;

import lombok.Data;

@Data
public class Count {
    private String bigRegion;
    private int wantedCnt;
    private int seekCnt;
    private float rate;
}

package com.vaiv.chart.rest.service;

import com.vaiv.chart.rest.domain.Sample;
import com.vaiv.chart.rest.mapper.SampleMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired
    private SampleMapper sampleMapper;

    public Sample getSample() {
        return sampleMapper.getSample();
    }
}
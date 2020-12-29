package com.vaiv.chart.rest.mapper;

import com.vaiv.chart.rest.domain.Sample;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {

    Sample getSample();
}

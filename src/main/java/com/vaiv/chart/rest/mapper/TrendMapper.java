package com.vaiv.chart.rest.mapper;

import java.util.List;

import com.vaiv.chart.rest.domain.Count;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TrendMapper {

    List<Count> getTop5Count();

    Count getSpecificAreaCount();

    Count getNationWideCount();

    List<Count> getCounts();
}

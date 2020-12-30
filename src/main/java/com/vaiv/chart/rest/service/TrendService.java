package com.vaiv.chart.rest.service;

import java.util.List;

import com.vaiv.chart.rest.domain.Count;
import com.vaiv.chart.rest.mapper.TrendMapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrendService {
    public static String namespace = "com.vaiv.chart.rest.mapper.TrendMapper";

    @Autowired
    private SqlSession session;

    @Autowired
    private TrendMapper trendMapper;

    public List<Count> getTop5Count() {
        List<Count> countList = session.selectList(namespace + ".getTop5Count");
        return countList;
    }

    public Count getSpecificAreaCount() {
        Count specificAreaCount = trendMapper.getSpecificAreaCount();
        return specificAreaCount;
    }

    public Count getNationWideCount() {
        Count nationWideCount = trendMapper.getNationWideCount();
        return nationWideCount;
    }

    public List<Count> getCounts() {
        List<Count> countList = session.selectList(namespace + ".getCounts");
        return countList;
    }
}
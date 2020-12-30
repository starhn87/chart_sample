package com.vaiv.chart.rest.controller;

import java.util.List;

import com.vaiv.chart.rest.domain.Count;
import com.vaiv.chart.rest.service.TrendService;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unchecked")
@RestController
public class TrendController {

    @Autowired
    private TrendService trendService;

    @GetMapping("/count")
    public ResponseEntity<JSONObject> getTrends() {

        JSONObject result = new JSONObject();

        List<Count> countList = trendService.getTop5Count();
        Count specificAreaCount = trendService.getSpecificAreaCount();
        Count nationWideCount = trendService.getNationWideCount();
        List<Count> counts = trendService.getCounts();

        result.put("countList", countList);
        result.put("specificAreaCount", specificAreaCount);
        result.put("nationWideCount", nationWideCount);
        result.put("counts", counts);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

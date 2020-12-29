package com.vaiv.chart.rest.controller;

import com.vaiv.chart.rest.domain.Sample;
import com.vaiv.chart.rest.service.SampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;
    
    @GetMapping("/sample")
    public ResponseEntity<Sample> getSample() {
        Sample sample = sampleService.getSample();
        return new ResponseEntity<>(sample, HttpStatus.OK);
    }
}

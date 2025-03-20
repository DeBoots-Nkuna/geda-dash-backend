package com.boots.geda_dash_backend.controller;


import com.boots.geda_dash_backend.dto.IndicatorListDTO;
import com.boots.geda_dash_backend.modal.Indicator;
import com.boots.geda_dash_backend.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class IndicatorRestController {

    //variable declaration
    private final IndicatorService indicatorService;

    //dependency injection
    @Autowired
    public IndicatorRestController(IndicatorService indicatorService) {
        this.indicatorService = indicatorService;
    }

    //rest endpoints declaration

    //get
    @GetMapping("/indicators")
    public List<IndicatorListDTO> getIndicators(){
        return indicatorService.getIndicators();
    }



    //post
    @PostMapping("/indicators")
    public Indicator storeIndicator(@RequestBody Indicator indicator){
        return indicatorService.storeIndicator(indicator);
    }


}

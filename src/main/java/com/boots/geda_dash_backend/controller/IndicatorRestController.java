package com.boots.geda_dash_backend.controller;


import com.boots.geda_dash_backend.dto.IndicatorListDTO;
import com.boots.geda_dash_backend.dto.IndicatorSummaryDTO;
import com.boots.geda_dash_backend.dto.UpdateIndicatorDTO;
import com.boots.geda_dash_backend.modal.Indicator;
import com.boots.geda_dash_backend.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<IndicatorListDTO>> getIndicators(){

        List<IndicatorListDTO> list = indicatorService.getIndicators();

        if(list.isEmpty()){
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);
    }

    //get method based on category
    @GetMapping("/indicators/filter/{category}")
    public ResponseEntity<List<IndicatorListDTO>> getIndicatorsByCategory(@RequestParam String category){
        //logging for debug
        System.out.println("Filtering indicators by category: " + category);

        List<IndicatorListDTO> list = indicatorService.getIndicatorsByCategory(category);

        if(list.isEmpty()){
            ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(list);
    }



    //post
    @PostMapping("/indicators")
    public Indicator storeIndicator(@RequestBody Indicator indicator){
        return indicatorService.storeIndicator(indicator);
    }

    //get by id
    @GetMapping("/indicators/{indicatorId}")
    public ResponseEntity<IndicatorSummaryDTO> getIndicatorSummaryById(@PathVariable int indicatorId){

        IndicatorSummaryDTO summaryDTO = indicatorService.getIndicatorSummaryById(indicatorId);

        if(summaryDTO == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(summaryDTO);
    }


    //put method
    @PatchMapping("/indicators/{indicatorId}")
    public ResponseEntity<String> updateIndicator(@PathVariable int indicatorId, @RequestBody UpdateIndicatorDTO indicator){

        System.out.println("Indicator from frontend: " + indicator);
        String result = indicatorService.updateIndicator(indicatorId, indicator);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/indicators/{indicatorId}")
    public ResponseEntity<String> deleteIndicator(@PathVariable int indicatorId){

        String result = indicatorService.deleteIndicator(indicatorId);
        return ResponseEntity.ok(result);
    }


}

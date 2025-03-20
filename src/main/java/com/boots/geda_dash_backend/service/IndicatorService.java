package com.boots.geda_dash_backend.service;

import com.boots.geda_dash_backend.dto.IndicatorListDTO;
import com.boots.geda_dash_backend.modal.Indicator;
import com.boots.geda_dash_backend.repo.IndicatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndicatorService {


    //variable declaration
    private IndicatorRepository repo;

    //dependency injection
    @Autowired
    public IndicatorService(IndicatorRepository repository) {
        repo = repository;
    }


    //methods declaration

    public Indicator storeIndicator(Indicator indicator){
        return repo.save(indicator);
    }

    public List<IndicatorListDTO> getIndicators(){
        return repo.getAllIndicators();
    }
}

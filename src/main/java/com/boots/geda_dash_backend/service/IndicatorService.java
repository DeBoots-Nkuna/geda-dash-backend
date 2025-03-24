package com.boots.geda_dash_backend.service;

import com.boots.geda_dash_backend.dto.IndicatorListDTO;
import com.boots.geda_dash_backend.dto.IndicatorSummaryDTO;
import com.boots.geda_dash_backend.dto.UpdateIndicatorDTO;
import com.boots.geda_dash_backend.exceptions.IndicatorNotFoundException;
import com.boots.geda_dash_backend.modal.Indicator;
import com.boots.geda_dash_backend.repo.IndicatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public List<IndicatorListDTO> getIndicatorsByCategory(String category){
        return repo.findIndicatorsByCategory(category);
    }

    public IndicatorSummaryDTO getIndicatorSummaryById(int id){
        return repo.findIndicatorDetailById(id);
    }

    public String updateIndicator(int indicatorId, UpdateIndicatorDTO dto){

        //retrieving indicator
        Indicator existingIndicator = repo.findById(indicatorId).orElseThrow(()-> new IndicatorNotFoundException("Indicator not found with ID "+ indicatorId));

        if (dto.getOrganisationFullName() != null) {
            existingIndicator.setOrganisationFullName(dto.getOrganisationFullName());
        }
        if (dto.getOrganisationContactName() != null) {
            existingIndicator.setOrganisationContactName(dto.getOrganisationContactName());
        }
        if (dto.getOrganisationContactEmail() != null) {
            existingIndicator.setOrganisationContactEmail(dto.getOrganisationContactEmail());
        }
        if (dto.getOrganisationWebsite() != null) {
            existingIndicator.setOrganisationWebsite(dto.getOrganisationWebsite());
        }
        if (dto.getIndicatorDescription() != null) {
            existingIndicator.setIndicatorDescription(dto.getIndicatorDescription());
        }

        if (dto.getMethodology() != null) {
            existingIndicator.setMethodology(dto.getMethodology());
        }
        if (dto.getCommunicationDetails() != null) {
            existingIndicator.setCommunicationDetails(dto.getCommunicationDetails());
        }

        repo.save(existingIndicator);
        return "Indicator updated Successfully";

    }


    public String deleteIndicator(int indicatorId){

        repo.deleteById(indicatorId);
        return "Indicator deleted Successfully";
    }


}

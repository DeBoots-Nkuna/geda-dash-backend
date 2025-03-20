package com.boots.geda_dash_backend.repo;

import com.boots.geda_dash_backend.dto.IndicatorListDTO;
import com.boots.geda_dash_backend.modal.Indicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IndicatorRepository extends JpaRepository<Indicator, Integer> {


    //CUSTOM QUERY
    @Query(value = "SELECT id, organisation_full_name, indicator_short_name, indicator_image "+ "FROM indicator ", nativeQuery = true)

    List<IndicatorListDTO> getAllIndicators();

}

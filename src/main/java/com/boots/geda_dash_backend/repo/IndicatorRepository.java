package com.boots.geda_dash_backend.repo;

import com.boots.geda_dash_backend.dto.IndicatorListDTO;
import com.boots.geda_dash_backend.dto.IndicatorSummaryDTO;
import com.boots.geda_dash_backend.modal.Indicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IndicatorRepository extends JpaRepository<Indicator, Integer> {


    //CUSTOM QUERY
    @Query(value = "SELECT id, organisation_full_name, indicator_short_name, indicator_image "+ "FROM indicator ", nativeQuery = true)

    List<IndicatorListDTO> getAllIndicators();

    @Query(value = "SELECT id, organisation_full_name, organisation_contact_name, organisation_contact_email, organisation_website, indicator_description, indicator_footprint, indicator_year_start, methodology, communication_details, indicator_image " +
            "FROM indicator " +
            "WHERE id = :id", nativeQuery = true)

    IndicatorSummaryDTO findIndicatorDetailById(@Param("id") int id);

    @Query(value = "SELECT id, organisation_full_name, indicator_short_name, indicator_thematic_areas, indicator_image " +
            "FROM indicator " +
            "WHERE JSON_CONTAINS(indicator_thematic_areas, CONCAT('\"', :category, '\"'))",
            nativeQuery = true)
    List<IndicatorListDTO> findIndicatorsByCategory(@Param("category") String category);



}

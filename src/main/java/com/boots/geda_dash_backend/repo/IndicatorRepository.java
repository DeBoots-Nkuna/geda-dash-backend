package com.boots.geda_dash_backend.repo;

import com.boots.geda_dash_backend.modal.Indicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndicatorRepository extends JpaRepository<Indicator, Integer> {
}

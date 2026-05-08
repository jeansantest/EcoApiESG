package com.esg.eco_api.repository;

import com.esg.eco_api.model.Coleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColetaRepository extends JpaRepository<Coleta, Long> {
}
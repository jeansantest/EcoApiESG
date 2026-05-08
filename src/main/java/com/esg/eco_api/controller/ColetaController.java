package com.esg.eco_api.controller;

import com.esg.eco_api.model.Coleta;
import com.esg.eco_api.repository.ColetaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/coletas")
public class ColetaController {

    @Autowired
    private ColetaRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Coleta criar(@Valid @RequestBody Coleta coleta) {
        return repository.save(coleta);
    }

    @GetMapping
    public List<Coleta> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Coleta buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}
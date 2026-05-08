package com.esg.eco_api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String endereco;

    @NotBlank
    private String tipoResiduo;
}
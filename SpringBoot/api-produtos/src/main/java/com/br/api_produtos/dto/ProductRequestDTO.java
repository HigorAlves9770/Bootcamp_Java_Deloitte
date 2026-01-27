package com.br.api_produtos.dto;

//Representa o que a API aceita receber
//Serve pra validação, segurança e controle

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductRequestDTO {

    @NotBlank
    private String name;

    @NotNull
    private Double price;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}

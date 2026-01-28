package com.br.api_produtos.dto;

// A classe ProductResponseDTO representa o que a API escolhe expor ao cliente e o que abstrair numa resposta
// This class represents what the API chooses to expose to the client and can hide sensitive fields

public class ProductResponseDTO {

    private Long id;
    private String name;
    private Double price;

    public ProductResponseDTO(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}

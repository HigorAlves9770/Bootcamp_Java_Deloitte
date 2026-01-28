package com.br.api_produtos.Repository;


import com.br.api_produtos.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApiProdutosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiProdutosApplication.class, args);
    }
}

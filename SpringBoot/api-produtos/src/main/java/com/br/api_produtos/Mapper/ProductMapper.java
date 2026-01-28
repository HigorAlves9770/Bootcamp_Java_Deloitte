package com.br.api_produtos.Mapper;

import com.br.api_produtos.Model.Product;
import com.br.api_produtos.dto.ProductRequestDTO;
import com.br.api_produtos.dto.ProductResponseDTO;
import org.springframework.stereotype.Component;

//A classe responsável pela conversão entre DTO e Model
// Responsible class for converting between DTO and Model

@Component
public class ProductMapper {


    public Product toEntity(ProductRequestDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        return product;
    }


    public ProductResponseDTO toResponse(Product product) {
        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getPrice()
        );
    }
}


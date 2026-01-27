package com.br.api_produtos.Service;

import com.br.api_produtos.dto.ProductRequestDTO;
import com.br.api_produtos.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {

    ProductResponseDTO create(ProductRequestDTO dto);

    ProductResponseDTO findById(Long id);

    List<ProductResponseDTO> findAll();

    ProductResponseDTO update(Long id, ProductRequestDTO dto);

    void delete(Long id);
}

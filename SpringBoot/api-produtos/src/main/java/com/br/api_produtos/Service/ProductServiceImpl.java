package com.br.api_produtos.Service;

import com.br.api_produtos.Model.Product;
import com.br.api_produtos.Repository.ProductRepository;
import com.br.api_produtos.dto.ProductRequestDTO;
import com.br.api_produtos.dto.ProductResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

// Classe responsável pela implementação da camada de serviço do Produto.
// Class responsible for the implementation of the product service layer.

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public ProductResponseDTO create(ProductRequestDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());

        Product saved = repository.save(product);

        return toResponseDTO(saved);
    }

    @Override
    public ProductResponseDTO findById(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        return toResponseDTO(product);
    }


    @Override
    public List<ProductResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(this::toResponseDTO)
                .toList();
    }

    @Override
    public ProductResponseDTO update(Long id, ProductRequestDTO dto) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        product.setName(dto.getName());
        product.setPrice(dto.getPrice());

        Product updated = repository.save(product);

        return toResponseDTO(updated);
    }

    @Override
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Produto não encontrado");
        }
        repository.deleteById(id);
    }

    private ProductResponseDTO toResponseDTO(Product product) {
        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getPrice()
        );
    }
}

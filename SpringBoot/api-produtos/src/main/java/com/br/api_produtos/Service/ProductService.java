package com.br.api_produtos.Service;

import com.br.api_produtos.dto.ProductRequestDTO;
import com.br.api_produtos.dto.ProductResponseDTO;

import java.util.List;

// Interface responsável pelo contrato da camada de serviço para Product
// Interface responsible for defining the service layer contract for Product

public interface ProductService {

<<<<<<< HEAD
    public ProductService(ProductRepository repository) {
        this.repository = repository;

    }

    public Product create(Product product) {
        return repository.save(product);
    }


    }
=======
    ProductResponseDTO create(ProductRequestDTO dto);
>>>>>>> main

    ProductResponseDTO findById(Long id);

<<<<<<< HEAD
    // READ BY ID

    public Product findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }
=======
    List<ProductResponseDTO> findAll();
>>>>>>> main

    ProductResponseDTO update(Long id, ProductRequestDTO dto);

<<<<<<< HEAD
    // UPDATE

    public Product update(Long id, Product product) {
        Product existing = findById(id);

        existing.setName(product.getName());
        existing.setPrice(product.getPrice());

        return repository.save(existing);
    }

    public List<Product> returnAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);


        return repository.save(existing);
    }

    // DELETE
    public void delete(Long id) {
        Product product = findById(id);
        repository.delete(product);
    }
=======
    void delete(Long id);
>>>>>>> main
}

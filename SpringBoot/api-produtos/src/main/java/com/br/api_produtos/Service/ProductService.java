package com.br.api_produtos.Service;

import com.br.api_produtos.Model.Product;
import com.br.api_produtos.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;

    }

    public Product create(Product product) {
        return repository.save(product);
    }


    }

    // CREATE
    public Product create(Product product) {
        return repository.save(product);
    }

    // READ BY ID

    public Product findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    // READ ALL
    public List<Product> returnAll() {
        return repository.findAll();
    }

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
}

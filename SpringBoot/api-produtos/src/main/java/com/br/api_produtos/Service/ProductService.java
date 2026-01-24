package com.br.api_produtos.Service;

import com.br.api_produtos.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    // Create a new product
    public Product create(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    // Return a product by ID
    public Product findById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    // Update product by id
    public Product update(Long id, Product product) {
        Product existing = findById(id);
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        return existing;
    }

    // Return all products
    public List<Product> returnAll() {
        return products;
    }

    // Delete product by id
    public void delete(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}

package com.br.api_produtos.Controller;

import com.br.api_produtos.Model.Product;
import com.br.api_produtos.Service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }


    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return service.findById(id);
    }


    @GetMapping
    public List<Product> returnAll() {
        return service.returnAll();
    }


    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

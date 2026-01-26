package com.br.api_produtos.Repository;

import com.br.api_produtos.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

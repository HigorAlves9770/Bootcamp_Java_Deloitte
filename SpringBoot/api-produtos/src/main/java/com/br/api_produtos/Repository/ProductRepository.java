package com.br.api_produtos.Repository;

import com.br.api_produtos.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//Classe responsável pela configuracao do banco de Dados - Neste projeto, utilizamos o H2 Console para ambiente de desenvolvimento.
//class responsible for dataBase connection - In this project, we are using H2-Console for the development

public interface ProductRepository extends JpaRepository<Product, Long> {

}

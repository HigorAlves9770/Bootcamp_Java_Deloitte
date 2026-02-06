package com.br.api_produtos.Controller;

import com.br.api_produtos.Model.Product;
import com.br.api_produtos.Service.ProductService;
import com.br.api_produtos.dto.ProductRequestDTO;
import com.br.api_produtos.dto.ProductResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/* Classe responsável por receber as requisições HTTP, validar os dados e delegar as regras de negócio
para a camada de serviço (ProductService) */

/*Class responsible for handling HTTP requests, validating data, and delegating business rules to the service layer (ProductService) */


import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/products")
@Tag(name = "Produtos", description = "CRUD para gerenciamento de produtos")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cadastrar produto", description = "Cria um novo produto no sistema")
    public ProductResponseDTO create(@RequestBody @Valid ProductRequestDTO dto) {
        return service.create(dto);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Listar pod ID", description = "Listar por Id")
    public ProductResponseDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    @Operation(summary = "Listar produtos", description = "Retorna uma lista com todos os produtos cadastrados")
    public List<ProductResponseDTO> findAll() {
        return service.findAll();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar produto", description = "Atualiza os dados de um produto existente")
    public ProductResponseDTO update(
            @PathVariable Long id,
            @RequestBody @Valid ProductRequestDTO dto
    ) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Excluir produto", description = "Remove um produto")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

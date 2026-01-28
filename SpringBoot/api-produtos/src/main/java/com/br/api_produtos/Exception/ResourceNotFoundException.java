package com.br.api_produtos.Exception;

//Classe responsável pelo tratamento de exceções
//Responsible class for exception handling

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
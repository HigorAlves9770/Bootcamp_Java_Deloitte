
# 🌐 Desafio Bootcamp Java - Deloitte 🚀


<h4 align="center"> 
	🚧 Gerenciamento de produtos em Java com Spring Boot 🚧
</h4>

<p align="center">
 <a>Sobre</a> •
 <a>Funcionalidade</a> •
 <a>Tecnologias</a> •
 <a>Hospedagem Azure</a> •
 <a>Layout</a> •
 <a>Endpoints</a> •
</p>

---

## 💻 Sobre o projeto

A aplicação é um sistema completo de gerenciamento de produtos, desenvolvido em **Java com Spring Boot**, criado como parte do **Desafio Bootcamp Java da Deloitte**.  O projeto tem como objetivo aplicar conhecimentos de **programação orientada a objetos (OOP)**, boas práticas de **arquitetura limpa**, **SOLID** e **design patterns**, além de consolidar habilidades em **Spring Boot, JPA/Hibernate e DTOs**.

---

## ⚙️ Funcionalidades

- [x] CRUD completo de produtos (Create, Read, Update, Delete)   
- [x] Validação de dados e tratamento de erros  
- [x] DTOs para separar entidades do banco de dados da API  
- [x] Estrutura modular com Service, Repository e Controller  

---

## 🏗 Arquitetura


- **Controller:** Recebe e responde requisições HTTP  
- **Service:** Contém a lógica de negócio  
- **Repository:** Responsável por persistência de dados via JPA/Hibernate  
- **DTOs:** Separação entre modelos de API e entidades do banco  
- **Database:** H2 (testes) / PostgreSQL (produção)  

Arquitetura baseada em **SRP (Single Responsibility Principle)** e **DIP (Dependency Inversion Principle)**.

## 🛠 Tecnologias

**Backend:**  
- Java 21  
- Spring Boot  
- Spring Data JPA / Hibernate  
- Maven  

**Banco de Dados:**  
- H2 (teste)

**Ferramentas:**  
- IntelliJ IDEA / VS Code  
- Git & GitHub  
- Postman

## ☁️ Hospedagem na Azure

Este projeto foi hospedado na **Microsoft Azure**, garantindo que a aplicação esteja disponível online para testes e demonstração.  

- **Serviço utilizado:** Azure App Service  
- **Runtime:** Java 21 + Spring Boot  
- **URL de acesso:** [https://bootcamp-produtos-higoralves-aagac7e6aecyfvb7.brazilsouth-01.azurewebsites.net/](https://bootcamp-produtos-higoralves-aagac7e6aecyfvb7.brazilsouth-01.azurewebsites.net/)  
- **Configuração:** Variáveis de ambiente configuradas no App Service para conexão com o banco de dados.  
- **Deploy:** Realizado diretamente do GitHub via integração contínua.  

> 🔹 A hospedagem na Azure permite que o backend esteja sempre online, pronto para ser acessado pelo frontend ou por qualquer cliente que consuma a API.

## 🎨 Layout

O layout da aplicação (frontend) está disponível no Figma:

### Web

<p align="center">
  <img alt="Cadastro de Produtos" title="Cadastro de Produtos" src="https://drive.google.com/uc?export=view&id=1sVupfgOy3Sjr2OCpC4NIUOIEUUIj2Tju" width="1200px">
</p>

## 📡 Endpoints da API

| Método | Endpoint       | Descrição                  |
|--------|----------------|----------------------------|
| GET    | /products      | Listar todos os produtos   |
| POST   | /products      | Criar novo produto         |
| GET    | /products/{id} | Obter produto pelo ID      |
| PUT    | /products/{id} | Atualizar produto          |
| DELETE | /products/{id} | Remover produto            |

<h2>👨‍💻 Criador</h2>
<table> <tr> <td align="center"> <a href="https://www.linkedin.com/in/higor-cabrall/"> <img src="https://avatars.githubusercontent.com/u/104106899?s=400&u=6ae8d212fe0462f9af2b7b1227276bd78b9dcf51&v=4" width="100px;" alt="Foto de Higor Cabral"/> <br/> <sub><b>Higor Cabral</b></sub> </a> </td> </tr> </table>

<h5>📌 LinkedIn: <a href="https://www.linkedin.com/in/higor-cabrall/" target="_blank">Higor Cabral</a></h5>

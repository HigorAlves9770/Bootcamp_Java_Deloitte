                                                    Simulado Deloitte

1 - É uma padrão de desenvolvimento que permite criar e trabalharmos com códigos orientados a objetos, tornando a forma de passarmos os parâmentros entre os métodos e classes mais seguro e fácil de manuear. 


2 - A função do encapsulamente é proteger os objetos e não permitir acesso público de outras classes as informações.


3 - Está violando o Encapsulamento! Os atributos id, nome e preço estão como público, violando a regra de encapsulamento dos objetos e fazendo com que aquela classe fique vulneravel. 


4 - O uso do getters e setters permite que o desenvolvedor possa acessar esse métodos para fazer alterações nas entidades/modelos, como por exemplo: Adicionar, atulizar e encontrar as informações do banco.

 
5 - A palavra chave private

```
public class Produto {
  private long id;
  private String nome;
  private double preco;

  //getters e Setters
}
```

6 - Spring boot é uma extensão do java que permite o desenvolvedor criar aplicações sem a necessidade de configurar arquivos como, por exemplo: Yaml, XML, entre outros. 
O Spring boot torna esse desenvolvimento mais fácil, rápido e ágil, fazendo com que o desenvolvedor não perca tempo e foque no desenvolvimento.


7 - @RestController


8 - A função do @RequestMapping é mapear as requisições HTTPS e envia-las ao lugar correto @PostMapping, @GetMapping, @PutMapping e @DeleteMapping


9 - No exemplos abaixo o erro está na chamada da classe repository. O código está chamando a classe repository, mas deveria estar se referênciando ao Lista Produto 
```
@GetMapping
public list <Produto> Listar(){
  return repository.findAll();
}
```
10 - Get - Pega os dados

Post - adiciona os dados

Delete - deleta os dados

Put - Atualiza os dados


11 - JPA e Hibernate é uma extensão do Java que fornece a capacidade do Spring Boot reconhecer códigos que dão acesso a Banco de dados, leituras SQL e anotações de relacionamentos de Classe, por exemplo: 

@ID

@Columns

@OneToOne

@Entity

@Table



12 - @Entity


13 - O @Id é uma anotação que permite criar um ID para uma Entidade responsável e servir como chave primaria e extrangeira. 
O @GeneratedValue é uma anotação que gera automaticamente o valor do @Id.


14 - No exemplo abaixo, esta é a classe que permite configurarmos e acessar o Banco de dados nela. No código abaixo não estamos acessando nenhum banco de dados, apenas guardando as informações em memória.
```
public interface ProdutoRepository extends JPARepository <Produto, Long> {
  }
```



15 - Porque o JPA já entende o SQL automaticamente, não precisamos escrever uma Query para ele interpretar e ler. O JPA tem váris notações que permitem entender o SQL e o Banco de dados sem precisarmos escrever como isso é feito.


16 - O DTO é um padrão de desenvolvimento que permite separar as requisições em duas partes separadas em ResponseDTO e RequestDTO. 
Essa separação permite que o código definir o que devemos receber na requisição(RequestDTO) e o que vamos mostrar na resposta(ResponseDTO)


17 - Porque está acessando diretamente o produto e não está passando pelo DTO e nem o Mapper que é a parte do código que vai dar uma camada a mais de segurança, não acessando a entidade/modelo diretamente e 
separando o que devemos receber na requisição(RequestDTO) e na resposta(ResponseDTO)


18 - A interface Service vai ser a classe que será chamada em outros métodos, permitindo que a classe Implementação de Service não seja acessada diretamente


19 - A implementação de Service vai cuidar apenas da regra de negócio da aplicação. 


20 - O controller não irá acessar diretamente o Repository por causa de uma camada de segurança desenvolvida, acessando o Service, DTO e o mapper colocamos essa camada a mais de segurança na aplicação. 


21 - Single Responsability Principle é uma padrão de desenvolvimento que restringe a classe de fazer dois ou mais papeis, ela deve ter uma única função.
Por exemplo, não podemos criar a informação e salvar no banco de dados na mesma classe. 


22 - O primeiro principio solid (Single Responsability Principle - ) está sendo violado, porque a classe ProdutoController está aplicando diferentes funções para apenas uma classe. 
```
public class ProdutoController {
  public void salvar(){
    //validação
    //regra de negócio
    //Acesso ao Banco
  }
```
}


23 -


24 -


25 -


26 - No exemplo abaixo, o principio que está sendo violado é o Interface Segregation Principle (ISP)
```
public interface ProdutoService {
  salvar()
  listar()
  exportarPDF()
  enviarEmail()
  }
```


27 - Inversão de depência ou DIP é uma prática que permite desenvolvermos aplicações voltadas ao uso de Interfaces, para não ter que acessar diretamente a classe. 
No código desenvolvido em sala usamos o caso de a interface ProductService e a implementação ProductServiceImpl


28 - No exemplo abaixo, a pratica desenvolvida em sala está alinhada ao DIP, pois ela é a interface da classe ProductServiceImpl
```
public interface ProductService {

    ProductResponseDTO create(ProductRequestDTO dto);
    ProductResponseDTO findById(Long id);
    List<ProductResponseDTO> findAll();
    ProductResponseDTO update(Long id, ProductRequestDTO dto);
    void delete(Long id);
}
```


29 - Cliente, Controller, DTO, Service, Mapper, Model, Repository


30 - DTO + Service + SOLID é uma padrão de desenvolvimento que permite o código ter um fácil entendimento, ser simples de aplicar mudanças e adicionar novos código. Esses principios únidos tornam a aplicação mais segura e ágil.

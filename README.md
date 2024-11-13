# Projeto Web Services com Spring Boot e JPA/Hibernate

Este é um projeto desenvolvido no curso completo de Java da [DevSuperior](https://devsuperior.com.br) com o professor Dr. Nelio Alves. O objetivo do projeto é desenvolver uma aplicação de web services com Java utilizando Spring Boot e JPA/Hibernate.

## Objetivos do Projeto

- Criar um projeto Spring Boot com Java.
- Implementar o modelo de domínio.
- Estruturar as camadas lógicas do sistema (resource, service, repository).
- Configurar um banco de dados de teste (H2) e povoar os dados.
- Implementar as operações básicas de CRUD (Create, Retrieve, Update, Delete).
- Realizar o tratamento de exceções.

## Tecnologias e Ferramentas Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Banco de dados H2 (ambiente de teste)**
- **Maven**

## Estrutura do Projeto

O projeto segue uma arquitetura dividida em camadas:

1. **Modelo de Domínio**: Entidades e suas relações.
2. **Repository**: Interface para persistência de dados.
3. **Service**: Camada de lógica de negócios.
4. **Resource**: Controladores REST para disponibilizar os endpoints da API.

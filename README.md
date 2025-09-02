# 🐦 Projeto - Clone Simplificado do Twitter

Este é um projeto **replicado para estudo** do canal [Build & Run](https://www.youtube.com/@BuildRun).  
O objetivo foi aprender conceitos fundamentais do **Spring Boot**, explorando autenticação com **JWT**, paginação, DTOs e boas práticas de organização em APIs REST.

---

## ⚙️ Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3**
- **Spring Security (JWT)**
- **Spring Data JPA**
- **Banco de dados MySQL**
- **Beekeeper Community** (para interagir com o banco)
- **Bruno** (para testar a API)

---

## 🚀 Funcionalidades
- Cadastro e autenticação de usuários.
- Criação e exclusão de Tweets.
- Feed paginado e ordenado por data de criação.
- Controle de permissões:
  - Usuários podem deletar apenas seus próprios tweets.
  - Administradores podem deletar qualquer tweet.

---

## 📂 Estrutura do Projeto
- **Controller** → Lida com as requisições HTTP.
- **DTOs** → Estruturas para entrada e saída de dados.
- **Entities** → Representam as tabelas do banco.
- **Repository** → Comunicação com o banco de dados via Spring Data JPA.
- **Config** → Implementação de autenticação com JWT e controle de roles (usuário/admin).

---

## 🗄️ Como interagir com o Banco de Dados?
Foi utilizado o **Beekeeper Community** para consultar e manipular dados diretamente no PostgreSQL.

---

## 🌐 Como interagir com a API?
Os endpoints foram testados utilizando o **Bruno** (alternativa ao Postman).

Exemplo de endpoint:
```http
GET http://localhost:8080/feed?page=0&pageSize=10

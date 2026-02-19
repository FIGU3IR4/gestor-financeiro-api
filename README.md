# 💰 Gestor Financeiro API

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" />
  <img src="https://img.shields.io/badge/Docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white" />
</p>

> Uma API RESTful robusta para controle e gestão financeira pessoal.

## 💻 Sobre o projeto

O **Gestor Financeiro API** é o back-end de um sistema voltado para o controle de finanças pessoais. Ele permite o registro de receitas e despesas, categorização de transações e o acompanhamento do saldo mensal. Este projeto foi desenvolvido para facilitar a organização financeira do dia a dia, fornecendo dados estruturados e seguros para aplicações front-end ou mobile.

## 🚀 Funcionalidades

- [x] Cadastro e autenticação de usuários (Spring Security + JWT)
- [x] Registro de receitas e despesas
- [x] Categorização de transações (ex: Alimentação, Lazer, Moradia, etc.)
- [x] Consulta de saldo atual e resumos mensais
- [x] Paginação e filtros para busca avançada de transações

## 🛠️ Tecnologias Utilizadas

O projeto é construído com as seguintes tecnologias e práticas:

- **Java**
- **Spring Boot** (Web, Data JPA, Security, Validation)
- **PostgreSQL** (Banco de dados relacional)
- **Lombok** (Redução de código boilerplate)
- **Swagger/OpenAPI** (Documentação interativa da API)
- **JUnit / Mockito** (Testes automatizados)

## ⚙️ Como executar o projeto

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) e [Maven](https://maven.apache.org/). 
Recomenda-se também o uso do [Docker](https://www.docker.com/) para rodar o banco de dados facilmente.

### 🎲 Rodando a API Localmente

```bash
# Clone este repositório
$ git clone [https://github.com/FIGU3IR4/gestor-financeiro-api.git](https://github.com/FIGU3IR4/gestor-financeiro-api.git)

# Acesse a pasta do projeto no terminal
$ cd gestor-financeiro-api

# Compile o projeto e baixe as dependências
$ ./mvnw clean install

# Execute a aplicação
$ ./mvnw spring-boot:run
A API iniciará na porta padrão 8080. o Swagger esta configurado, você poderá acessar a documentação via: http://localhost:8080/swagger-ui.html.📚 Endpoints Principais (Exemplo)Aqui estão alguns dos principais endpoints que a API disponibiliza:MétodoRotaDescriçãoPOST/api/auth/loginAutenticação do usuário e retorno do tokenPOST/api/transacoesCria uma nova transação (receita ou despesa)GET/api/transacoesLista todas as transações do usuário logadoGET/api/transacoes/{id}Busca os detalhes de uma transação específicaPUT/api/transacoes/{id}Atualiza uma transação existenteDELETE/api/transacoes/{id}Remove uma transação🤝 Como ContribuirFaça um fork do projeto.Crie uma nova branch com as suas alterações: git checkout -b minha-featureSalve as alterações e crie uma mensagem de commit dizendo o que você fez: git commit -m "feature: adicionando nova funcionalidade"Envie as suas alterações: git push origin minha-featureAbra um Pull Request.Desenvolvido por Victor Figueira. Fique à vontade para entrar em contato!
Sinta-se livre para ajustar os endpoints ou as funcionalidades de acordo com a regra de negócios exata que você está construindo. Se quiser que eu altere alguma tecnologia ou adicione instruções de como rodar o banco de dados pelo Docker, é só avisar!

<h1><b>Market Master</b></h1>

<b>Visão Geral</b>

  Este projeto é uma aplicação Java com Spring Boot com implementação de APIs RESTful utilizando Swagger para
  documentação e JUnit com Mockito para efetuar os testes unitários. 

<h1><b>Tecnologias</b></h1>

  <ul>
    <li>Java</li>
    <li>Spring Boot</li>
    <li>OAuth</li>
    <li>JWT</li>
    <li>MySQL</li>
    <li>Swagger</li>
    <li>JUnit</li>
    <li>Mockito</li>
    <li>RESTful</li>
  </ul>

<b>PRÉ-REQUISITOS</b>

  Java 17 ou superior <br>
  Maven<br>
  Git<br>

<h1><b>Instalação</b></h1>

  1. Clone o repositório:<br>
    git clone https://github.com/gustavox-dev/Market-Master.git  <br>
  
  2. Acesse o diretório do projeto<br>
  3. Instale as dependências:<br>
     mvn install <br>

<h1><b>Execução</b></h1>

  1. Inicie a aplicação:<br>
     mvn spring-boot:run  <br>
  2. Api acessivel em http://localhost:8080<br>
  3. Documentação do Swagger:<br>
     http://localhost:8080/docs/swagger-ui/index.html#/ <br>


<h1><b>Autenticação</b></h1>

A API usa Spring Security para controle de autenticação. As seguintes funções estão disponíveis:

USER -> Função de usuário padrão para usuários logados.<br>
ADMIN -> Função administrativa para parceiros gestores (registo de novos parceiros).

Para acessar endpoints protegidos como usuário ADMIN, forneça as credenciais de autenticação apropriadas no cabeçalho da solicitação.


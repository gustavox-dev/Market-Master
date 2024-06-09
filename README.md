<h1><b>Market Master</b></h1>

<b>Visão Geral</b>

  Este projeto é uma aplicação Java com Spring Boot com implementação de APIs RESTful utilizando Swagger para
  documentação e JUnit com Mockito para efetuar os testes unitários. 

<b>Tecnologias</b>
<hr>
<br><br>
  Java<br>
  Spring Boot<br>
  Swagger<br>
  JUnit<br>
  Mockito<br>
  RESTful<br>

<b>Pré-requisitos</b>

  Java 17 ou superior <br>
  Maven<br>
  Git<br>

<b>Instalação</b>
<hr>
  1. Clone o repositório:<br>
    git clone https://github.com/gustavox-dev/Market-Master.git  <br>
  
  2. Acesse o diretório do projeto<br>
  3. Instale as dependências:<br>
     mvn install <br>

<b>Execução</b>
<hr>
<br>

  1. Inicie a aplicação:<br>
     mvn spring-boot:run  <br>
  2. Api acessivel em http://localhost:8080<br>
  3. Documentação do Swagger:<br>
     http://localhost:8080/docs/swagger-ui/index.html#/ <br>


<b>Autenticação</b>
<hr>
<br>
A API usa Spring Security para controle de autenticação. As seguintes funções estão disponíveis:

USER -> Função de usuário padrão para usuários logados.
ADMIN -> Função administrativa para parceiros gestores (registo de novos parceiros).

Para acessar endpoints protegidos como usuário ADMIN, forneça as credenciais de autenticação apropriadas no cabeçalho da solicitação.


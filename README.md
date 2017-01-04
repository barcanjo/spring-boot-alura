# spring-boot-alura
### Curso de Spring Boot Alura visando agilidade no desenvolvimento de aplicações Java com Spring Boot.

*O projeto Lista VIP permite cadastrar e listar convidados. Ao salvar um novo convidado um e-mail é enviado para seu endereço de e-mail, notificando-o do cadastro.*


O projeto é constituído dos módulos:
- enviador-email
- listavip

### enviador-email

O módulo **enviador-email** tem a capacidade de enviar e-mails para contas utilizando a biblioteca `commons-mail` do pacote `org.apache.commons`.

### listavip

O módulo **listavip** é uma aplicação web baseada no *Servlet Container* `Jetty`.
Utilizando o padrão de templates do Spring Boot `Thymeleaf` a view do projeto é tratada nas página HTML, que recebem os dados do back-end através do `Spring Web MVC`.

O acesso a dados é feito utilizando o projeto `Spring Data JPA` do próprio Spring, que obtém e envia os dados para o banco de dados `Postgresql`.

Para facilitar o **hotdeploy** de alguns recursos do projeto, em tempo de execução, foi utilizado o `Spring Dev Tools` para agilizar o processo de mudanças nos arquivos e atualização no navegador, removendo a necessidade de reiniciar o Container para carregar as alterações.
Para gerenciamento de informações do projeto, métricas e dados da aplicação foi usado o `actuator` para que através de URLs mapeadas seja possível fazer análises em tempo de execução.

Por último, o módulo `enviador-emails` foi adicionado como uma depedência para que seu serviço de enviar e-mails seja consumido pelo projeto.


### Requerimentos
- Java 1.8
- Postgresql

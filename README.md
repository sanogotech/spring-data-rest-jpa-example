# Spring Data REST and JPA Example
This project depicts the Spring Boot Example with Spring Data REST and JPA Example

## Description


## Docs API

* Swagger

- http://localhost:8080/swagger-ui.html
- http://localhost:8080/v2/api-docs

*  HAL  Browser
This Project shows the list of Users which are stored in the In-Memory H2 Database. Using the following endpoints, different operations can be achieved:

- http://localhost:8080/browser/index.html#/2



## Libraries used
- Spring Boot
- Spring Configuration
- Spring DATA REST Controller
- Spring JPA
- H2
- Development Tools



## Compilation Command
- `mvn spring-boot:run`

## Docker
docker build -t apifirst/springboot .
docker run -p 8080:8080 -t apifirst/springboot

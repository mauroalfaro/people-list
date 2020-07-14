# people-list-docker 
[![GitHub release (latest by date)](https://img.shields.io/github/v/release/mauroalfaro/people-list-mocked)](https://github.com/mauroalfaro/people-list-mocked/releases/tag/v1.0)

## Description
people-list project with CRUD operations impacting a mocked list of objects.

## Design
Basic Spring application with 3 controllers, developed with the objective to help aspiring Spring developers to learn basic Spring features.
Includes:
- Spring MVC
- Spring Boot
- Spring Boot Test
- Mockito for MVC unit testing
- Java 8 lambdas
- OpenApi UI to test the app

## Using the app
To build the app without tests, run:

```bash
 mvn clean install -DskipTests=true
```

And then execute
```bash
java -jar people-list-docker/target/people-list-mocked-1.0-RELEASE.jar
```

The API provides endpoints for the three models available: Customers, Employees and Stores. Providing CRUD operations.
You can check the Swagger UI for documentation about these endpoints. Hit http://localhost:8080/swagger-ui.html

## Run the tests
Run
```bash
mvn clean test
```

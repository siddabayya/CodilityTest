# STCodility

This document provides step by step explanations on the Code and Execution process.

Technologies used:

Java 8
Spring Boot

1) Extract and import source as a maven project in Eclipse IDE.

2) Main Class:
  com.codility.Solution is the main class which you can run and see all the cases implemented in here.

 Comments are provided For each statement in the class as per assessment document.

3) Spring Boot RESTFul Services

 Run below Java class as it's a starting point for the Spring Boot RESTFul service.
 
 public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
  }
  
  4) Access RESTFul endpoints in any Web Browser
  
      http://localhost:8080/solution?name=duck
      {"walkble":{},"singable":{},"swimmable":{},"flyable":{}}

      http://localhost:8080/solution?name=shark
      {"walkble":null,"singable":null,"swimmable":{}}

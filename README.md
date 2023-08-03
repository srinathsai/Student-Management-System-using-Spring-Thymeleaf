# Student-Management-System-using-Spring-Thymeleaf

## Motivation:- 
In my previous Springboot applications which are Todo Management and User management I have implemented only Database operations using Spring Boot, so in order to check their working we required external Postman API, client-server, and needs a lot of manual processes in changing the requested link, JSON body ..etc. In an ideal atmosphere, this task is very very tedious. So one improvement can be implementing a form-like structure in the front end where users can play with the Database by just entering information or clicking buttons. Therefore this project aims to achieve the above-mentioned task using Spring Thymeleaf while maintaining the crud operations on the database using Spring Data JPA and DTO layer.

## Introduction:-
Thymeleaf is a Java template engine on the client side for processing and creating HTML, XML, JavaScript, CSS, and text. The Thymeleaf engine will search for templates in the resources folder, based on the written Thymeleaf keywords in the HTML it relates the objects and their working and gives results in HTML. In other words, it's working can be described by the following steps:-
  - Thymeleaf follows a De-Coupled Architecture .<br />
  - In the same way, it is unaware of Spring’s abstraction of the model and thus cannot handle the data that the controller places in the Model.<br />
  - When Spring-Boot’s autoconfiguration detects Thymeleaf in the classpath, it creates beans supporting Thymeleaf view for Spring MVC.<br />
  - It can work with request attributes of Servlet.<br />
  - Therefore, Spring copies the model data into request attributes that the Thymeleaf template can work with. <br />

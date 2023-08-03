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

## Architecture:-
  ![this is an image](https://github.com/srinathsai/Student-Management-System-using-Spring-Thymeleaf/blob/main/2.jpg)

  ## Steps of Execution:-
  - First, download the code and open it in IntelliJIdea or any Java IDE.(Note you no need to add any configurations for Spring or you no need to adjust any dependency version because here by using Spring initializer 
      necessary dependencies with recent versions have been added and it is reflected in Pom.xml file.)< br />
  - In application.properties file change Spring.datasource url to your MySQL url which at the time of installing MySQL you would get this url. <br />
  - Change username and password in application.properties file of yours that you have set while installing MySQL .<br />
  - Change hibernate dialect to MySQL dialect.<br />
  (Note just change urls that are present on right hand side of equal to sign in Applications.properties file).<br />
  - Now for playing with this system you need to type url localhost:8080/students in web browser . Then you will be first seen with a form of list of students already in databse if not you can create a new one by clicking new student in navigation bar. Each and every detail of student is validated with Spring validation annotations and dependency. If there are students in your db then you will have 3 options beside him in 3 buttons which are delete, edit, view and by pressing them they will work accordingly.<br />
  

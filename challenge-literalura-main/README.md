<h1 align="center"> LiterAlura - Catálogo de Libros </h1>

<div align="center">



## Índice

<!-- TOC -->

  * [1. Resumen del proyecto🤩](#1-resumen-del-proyecto)
  * [2. Objetivos del aprendizaje✅](#2-objetivos-del-aprendizaje)
  * [3. Resultado del Proyecto📝](#3-resultado-del-proyecto)
          * [Resultado Final](#resultado-final)
  * [4. Instrucciones de Instalación🔍](#4-instrucciones-de-instalación)
  * [5. Tecnologias Utilizadas✅](#5-tecnologias-utilizadas)
<!-- TOC -->

***

## 1. Resumen del proyecto🤩


OBJETIVOS DEL PROYECTO: Desenvolver un catálogo de libros en el cual la persona usuaria puede registrar libros en una base de datos y recibir información sobre estos libros que ya están registrados en la base de datos.

* Buscar libro por título.
* Listar libros registrados.
* Listar autores registrados.
* Listar autores vivos en un determinado año.
* Listar libros por idioma.

Los libros serán buscados através de una API específica  [Gutendex](https://gutendex.com/).

Pasos completados:

* Configuración del Ambiente Java;
* Creación del Proyecto;
* Consumo de API;
* Analizar la Respuesta JSON;
* Inserción y consulta de la Base de Datos;
* Exibición de los resultados a los Usuarios;

## 2. Objetivos del aprendizaje✅

- Java
- Spring Boot
- Spring Data JPA
- Jackson
- PostgreSQL

## 3. Resultado del Proyecto📝

###### Resultado Final
![Gif.gif](src%2Fmain%2Fimg%2FGif.gif)

## 4. Instrucciones de Instalación🔍

* Clonar este repositorio.
* Instale PostgreSQL
* Configure la base de dados de PostgreSQL
* Configuración de archivos -> SRC - Resources - Application.properties 
* Altere informacion con sus datos

```
spring.datasource.url=jdbc:postgresql://localhost/literalura
spring.datasource.username= (Digite su nombre)
spring.datasource.password= (Digite su contraseña)
spring.datasource.driver-class-name=org.postgresql.Driver
hibernate.dialect=org.hibernate.dialect.HSQLDialect

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.format-sql=true`

```


* Actualizar las dependencias de Maven.
* Ejecutar la aplicación.


## 5. Tecnologias Utilizadas✅

<div>
    <img src="https://img.icons8.com/color/452/java-coffee-cup-logo--v1.png" alt="Java Logo" width="50" height="50">
    <img src="https://img.icons8.com/color/452/intellij-idea.png" alt="IntelliJ Logo" width="50" height="50">
    <img src="https://img.icons8.com/color/452/spring-logo.png" alt="Spring Boot Logo" width="50" height="50">
    <img src="https://img.icons8.com/color/452/postgreesql.png" alt="PostgreSQL Logo" width="50" height="50">
</div>

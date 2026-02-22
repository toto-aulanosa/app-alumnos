# API REST - Gestión de Alumnos

## Descripción del proyecto

Este proyecto es una API REST desarrollada con Spring Boot que permite gestionar alumnos almacenados en una base de datos MySQL.

La aplicación permite:

- Crear alumnos
- Consultar todos los alumnos
- Buscar alumnos por ID

Cada alumno contiene:

- `id`
- `nombre`
- `email`

La base de datos se gestiona automáticamente mediante Spring Data JPA (Hibernate).

---

## Endpoints disponibles

### Crear alumno

**POST**

```
http://localhost:8080/alumnos
```

Body (JSON):

```json
{
  "nombre": "Juan",
  "email": "juan@email.com"
}
```

---

### Listar todos los alumnos

**GET**

```
http://localhost:8080/alumnos
```

---

### Buscar alumno por ID

**GET**

```
http://localhost:8080/alumnos/{id}
```

Ejemplo:

```
http://localhost:8080/alumnos/1
```

---

## Cómo ejecutar el proyecto

### Requisitos

- Java 17 o superior
- Maven
- MySQL (por ejemplo XAMPP)

Asegúrate de que MySQL esté ejecutándose y que exista la base de datos:

```
clase
```

---

### Configuración de base de datos

Archivo:

```
src/main/resources/application.properties
```

Debe contener algo como:

```properties
spring.application.name=app

# Puerto del servidor
server.port=8080

# Configuracion de MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/clase
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### Ejecutar con Maven

Desde la raíz del proyecto:

```bash
mvn spring-boot:run
```

O generar el .jar:

```bash
mvn clean package -DskipTests
java -jar target/app-0.0.1-SNAPSHOT.jar
```

---

## Tecnologías utilizadas

- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Dependencias usadas en el Spring Initializr

- Spring Web
- Spring Data JPA
- MySQL Driver

## Opciones seleccionadas en el Spring Initializr

- **Project:** 🟢 Maven
- **Language:** 🟢 Java
- **Spring Boot:** 🟢 4.0.3
- **Packaging:** 🟢 Jar
- **Configuration:** 🟢 Properties
- **Java:** 🟢 17

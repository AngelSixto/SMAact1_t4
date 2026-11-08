# SMAact1_t4 — Introducción a Spring Boot

**Alumno:** Angel Sixto Morales (SMA)
**Materia:** Programación Web — Ing. Adelina Martínez Nieto
**Grupo:** 7SD — Instituto Tecnológico de Oaxaca (TecNM)

Proyecto creado con Spring Initializr (Maven, Java 17, Spring Boot 3.5.x).
Dependencias: **Spring Web**, **Thymeleaf**, **Spring Boot DevTools**.

## Estructura

```
src/main/java/mx/edu/itoaxaca/smaact1/
├── Smaact1Application.java          # Clase principal (@SpringBootApplication)
└── controllers/
    ├── EjemploController.java       # @Controller  -> devuelve una vista HTML
    └── EjemploRestController.java   # @RestController -> devuelve texto / JSON
src/main/resources/
├── templates/detalles_info.html     # Vista Thymeleaf
└── application.properties
```

## Endpoints

| # | Método | Ruta | Controlador | Respuesta |
|---|--------|------|-------------|-----------|
| 1 | GET | `/proyecto` | EjemploRestController | Texto con nombre del proyecto y del alumno |
| 2 | GET | `/detalles_info2` | EjemploRestController | JSON (Map) con datos del alumno |
| 3 | GET | `/detalles_info` | EjemploController | Página HTML con datos pasados por `Model` |

## Ejecutar en local

```bash
./mvnw spring-boot:run        # Windows: .\mvnw spring-boot:run
```

- http://localhost:8080/proyecto
- http://localhost:8080/detalles_info2
- http://localhost:8080/detalles_info

## Generar el .jar

```bash
./mvnw clean package          # genera target/smaact1.jar
java -jar target/smaact1.jar --server.port=PUERTO
```



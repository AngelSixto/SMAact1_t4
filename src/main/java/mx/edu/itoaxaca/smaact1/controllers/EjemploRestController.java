package mx.edu.itoaxaca.smaact1.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador 2 (@RestController): devuelve los datos directamente
 * en el cuerpo de la respuesta (texto o JSON), sin vista.
 */
@RestController
public class EjemploRestController {

    /**
     * Endpoint: GET http://localhost:8080/proyecto
     * Regresa el nombre del proyecto y del alumno (texto plano),
     * para identificar de quien es la instancia que corre en el servidor.
     */
    @GetMapping("/proyecto")
    public String proyecto() {
        return "Proyecto Sonrisas - Angel Sixto Morales (SMA)";
    }

    /**
     * Endpoint: GET http://localhost:8080/detalles_info2
     * Regresa los datos del alumno como JSON usando un Map.
     */
    @GetMapping("/detalles_info2")
    public Map<String, Object> detallesInfo2() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("nombre", "Angel Sixto Morales");
        respuesta.put("iniciales", "SMA");
        respuesta.put("carrera", "Ingenieria en Sistemas Computacionales");
        respuesta.put("grupo", "7SD");
        respuesta.put("institucion", "Instituto Tecnologico de Oaxaca (TecNM)");
        respuesta.put("materia", "Programacion Web");
        return respuesta;
    }
}

package mx.edu.itoaxaca.smaact1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador 1 (@Controller): devuelve una VISTA (pagina HTML con Thymeleaf)
 * y le pasa datos mediante Model.
 */
@Controller
public class EjemploController {

    /**
     * Endpoint: GET http://localhost:8080/detalles_info
     * Muestra la pagina templates/detalles_info.html con los datos del proyecto.
     */
    @GetMapping("/detalles_info")
    public String info(Model model) {
        model.addAttribute("Nombre", "Lionel Messi");
        model.addAttribute("Edad", "38");
        model.addAttribute("Equipo", "Inter de Miami");
        model.addAttribute("Nacionalidad", "Argentina");
        return "detalles_info";
    }
}

package es.cpifp.losenlaces.cinelista.controller;


import es.cpifp.losenlaces.cinelista.model.Estadistica;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Seccion "Estadisticas".
 *
 * - GET /estadisticas      -> pagina con la tabla (estadisticas.html).
 * - GET /api/estadisticas  -> API REST con datos estaticos en JSON. Es la
 *                             fuente de datos (opcion "ajax") de DataTables.
 *
 * Los datos coinciden con static/data/estadisticas.json.
 */
@Controller
public class EstadisticasController {

    private static final List<Estadistica> ESTADISTICAS = List.of(
            new Estadistica(1L, "Project Hail Mary", "Ciencia ficcion", 82_000_000L, 8),
            new Estadistica(2L, "La Bola Negra", "Drama", 15_000_000L, 9),
            new Estadistica(3L, "Prisioners", "Thriller", 47_000_000L, 7),
            new Estadistica(4L, "Ted 2", "Comedia", 23_000_000L, 6),
            new Estadistica(5L, "Misión Imposible Fallout", "Accion", 96_000_000L, 8)
    );

    @GetMapping("/estadisticas")
    public String estadisticas() {
        return "estadisticas";
    }

    @GetMapping("/api/estadisticas")
    @ResponseBody
    public List<Estadistica> apiEstadisticas() {
        return ESTADISTICAS;
    }
}

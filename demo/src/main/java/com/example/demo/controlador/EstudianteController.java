package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/api")
public class EstudianteController {
    @GetMapping("/estudiantes")
    public List<Estudiante> listarEstudiantes() {
        return Arrays.asList(
                new Estudiante(1L, "Carlos Pérez", "Ingeniería de Sistemas"),
                new Estudiante(2L, "Ana Gómez", "Ingeniería de Sistemas"),
                new Estudiante(3L, "Luis Torres", "Ingeniería Industrial")
        );
    }
}
package com.example.demo.controlador;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Estudiante;



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

    @PostMapping("/estudiantes")
    public Estudiante crearEstudiante(@RequestBody Estudiante nuevoEstudiante){ 
    return nuevoEstudiante; 

     }
}
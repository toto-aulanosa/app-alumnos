package es.aulanosa.app.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import es.aulanosa.app.model.Alumno;
import es.aulanosa.app.repository.AlumnoRepository;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    private final AlumnoRepository repository;

    public AlumnoController(AlumnoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno) {
        return repository.save(alumno);
    }

    @GetMapping
    public List<Alumno> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Alumno buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}
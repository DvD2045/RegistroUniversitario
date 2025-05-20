package com.universidad.controller;

import com.universidad.dto.InscripcionDTO;
import com.universidad.model.Inscripcion;
import com.universidad.service.InscripcionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscripciones")
public class InscripcionController {

    @Autowired
    private InscripcionService service;

    @GetMapping
    public List<Inscripcion> listar() {
        return service.listar();
    }

    @PostMapping
    public Inscripcion crear(@Valid @RequestBody InscripcionDTO dto) {
        return service.crear(dto);
    }

    @GetMapping("/{id}")
    public Inscripcion obtener(@PathVariable Long id) {
        return service.obtener(id);
    }

    @PutMapping("/{id}")
    public Inscripcion actualizar(@PathVariable Long id, @Valid @RequestBody InscripcionDTO dto) {
        return service.actualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
package com.universidad.dto;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class InscripcionDTO {

    @NotNull
    private Long estudianteId;

    @NotNull
    private Long materiaId;

    @NotNull
    private LocalDate fechaInscripcion;

    // Getters y setters
    public Long getEstudianteId() { return estudianteId; }
    public void setEstudianteId(Long estudianteId) { this.estudianteId = estudianteId; }

    public Long getMateriaId() { return materiaId; }
    public void setMateriaId(Long materiaId) { this.materiaId = materiaId; }

    public LocalDate getFechaInscripcion() { return fechaInscripcion; }
    public void setFechaInscripcion(LocalDate fechaInscripcion) { this.fechaInscripcion = fechaInscripcion; }
}
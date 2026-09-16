package com.educa360.performance_tracking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "docentes")
public class Docente extends Persona {

    @Column(nullable = false, unique = true)
    private String codigoDocente;

    // Constructor requerido por JPA
    protected Docente() {
    }

    public Docente(
            Usuario usuario,
            String dni,
            String nombre,
            String apellido,
            java.time.LocalDate fechaNacimiento,
            String codigoDocente
    ) {
        super(usuario, dni, nombre, apellido, fechaNacimiento);
        this.codigoDocente = codigoDocente;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }
}
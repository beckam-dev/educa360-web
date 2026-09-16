package com.educa360.performance_tracking.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "apoderados")
public class Apoderado extends Persona {

    @Column(nullable = false, unique = true)
    private String codigoApoderado;

    protected Apoderado() {
    }

    public Apoderado(
            Usuario usuario,
            String dni,
            String nombre,
            String apellido,
            LocalDate fechaNacimiento,
            String codigoApoderado
    ) {
        super(usuario, dni, nombre, apellido, fechaNacimiento);
        this.codigoApoderado = codigoApoderado;
    }

    public String getCodigoApoderado() {
        return codigoApoderado;
    }

    public void setCodigoApoderado(String codigoApoderado) {
        this.codigoApoderado = codigoApoderado;
    }
}

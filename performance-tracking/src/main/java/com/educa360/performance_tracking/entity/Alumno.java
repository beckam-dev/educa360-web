package com.educa360.performance_tracking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos")
public class Alumno extends Persona {

    @Column(nullable = false, unique = true)
    private String codigoAlumno;

    // Constructor requerido por JPA
    protected Alumno() {
    }

    public Alumno(
            Usuario usuario,
            String dni,
            String nombre,
            String apellido,
            java.time.LocalDate fechaNacimiento,
            String codigoAlumno
    ) {
        super(usuario, dni, nombre, apellido, fechaNacimiento);
        this.codigoAlumno = codigoAlumno;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }
}

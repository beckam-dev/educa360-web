package com.educa360.performance_tracking.entity;

import com.educa360.performance_tracking.enums.Rol;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "usuario_roles",
            joinColumns = @JoinColumn(name = "usuario_id")
    )
    @Column(name = "rol")
    private Set<Rol> roles = new HashSet<>();

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void cambiarPassword(String password) {
        this.password = password;
    }

    public void agregarRol(Rol rol) {
        this.roles.add(rol);
    }

    public void quitarRol(Rol rol) {
        this.roles.remove(rol);
    }
}

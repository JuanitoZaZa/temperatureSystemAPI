package com.TemperatureSystem.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class User {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer userID;

    @Column(name = "nombre_usuario")
    private String username;

    @Column(name = "email")
    private String email;

    // getters and setters with Lombok
}

package com.TemperatureSystem.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "alertas")
@Data
public class Alert {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alerta")
    private Integer alertID;

    @Column(name = "mensaje")
    private String message;

    @Column(name = "creacion_alerta")
    private String creationTime;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "id_dispositivo")
    private Device device;

    // Getters and setters with Lombok
}

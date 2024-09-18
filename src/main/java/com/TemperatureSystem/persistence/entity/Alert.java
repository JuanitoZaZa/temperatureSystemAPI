package com.TemperatureSystem.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "alertas")
@Data
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alerta")
    private Integer alertID;

    @Column(name = "mensaje")
    private String message;

    @Column(name = "creacion_alerta")
    private String creationTime;

    @ManyToOne
    @JoinColumn(name = "id_dispositivo")
    private Device device;
}

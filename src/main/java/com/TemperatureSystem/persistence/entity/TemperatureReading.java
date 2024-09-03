package com.TemperatureSystem.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "LecturaTemperatura")
@Data
public class TemperatureReading {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lectura")
    private Integer temperatureReadingID;

    @Column(name = "temperatura")
    private Double temperature;

    @Column(name = "fecha_lectura")
    private String readingTime;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "id_dispositivo")
    private Device device;

    // Getters and Setters with Lombok

}

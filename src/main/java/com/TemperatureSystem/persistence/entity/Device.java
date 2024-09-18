package com.TemperatureSystem.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Dispositivo")
@Data
public class Device {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dispositivo")
    private Integer deviceID;

    @Column(name = "nombre_dispositivo")
    private String nameDevice;

    @Column(name = "ubicacion_dispositivo")
    private String location;

    // Relationships
    @OneToMany(mappedBy = "device")
    private List<TemperatureReading> temperatureReading;

    @OneToMany(mappedBy = "device")
    private List<Alert> alert;

    // Getters and Setters with Lombok

}

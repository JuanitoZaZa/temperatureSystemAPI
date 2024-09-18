package com.TemperatureSystem.domain;

import com.TemperatureSystem.persistence.entity.Device;
import lombok.Data;

@Data
public class AlertDomain {
    private Integer alertID;
    private String message;
    private String creationTime;
    private Device device;
}

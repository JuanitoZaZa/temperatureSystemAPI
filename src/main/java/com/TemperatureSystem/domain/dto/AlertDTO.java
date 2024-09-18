package com.TemperatureSystem.domain.dto;

import com.TemperatureSystem.persistence.entity.Device;
import lombok.Data;

@Data
public class AlertDTO {
    private int alertID;
    private String message;
    private String creationTime;
    private Device deviceID;
}

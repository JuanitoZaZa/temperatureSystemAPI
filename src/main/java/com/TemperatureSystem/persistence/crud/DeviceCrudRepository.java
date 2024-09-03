package com.TemperatureSystem.persistence.crud;

import com.TemperatureSystem.persistence.entity.Device;
import org.springframework.data.repository.CrudRepository;

public interface DeviceCrudRepository extends CrudRepository<Device, Integer> {
}

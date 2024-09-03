package com.TemperatureSystem.persistence.crud;

import com.TemperatureSystem.persistence.entity.TemperatureReading;
import org.springframework.data.repository.CrudRepository;

public interface TemperatureReadingCrudRepository extends CrudRepository<TemperatureReading, Integer> {
}

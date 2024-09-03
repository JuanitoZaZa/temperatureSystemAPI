package com.TemperatureSystem.persistence.crud;

import com.TemperatureSystem.persistence.entity.Alert;
import org.springframework.data.repository.CrudRepository;

public interface AlertCrudRepository extends CrudRepository<Alert, Integer> {
}

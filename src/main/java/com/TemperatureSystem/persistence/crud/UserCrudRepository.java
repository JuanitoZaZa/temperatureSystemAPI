package com.TemperatureSystem.persistence.crud;

import com.TemperatureSystem.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer> {
}

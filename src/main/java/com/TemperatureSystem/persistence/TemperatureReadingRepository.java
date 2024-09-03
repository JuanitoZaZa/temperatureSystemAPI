package com.TemperatureSystem.persistence;

import com.TemperatureSystem.persistence.crud.TemperatureReadingCrudRepository;
import com.TemperatureSystem.persistence.entity.TemperatureReading;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TemperatureReadingRepository {
    private TemperatureReadingCrudRepository temperatureReadingCrudRepository;

    // CREATE / UPDATE
    public TemperatureReading save(TemperatureReading temperatureReading){
        return temperatureReadingCrudRepository.save(temperatureReading);
    }

    // READ
    public List<TemperatureReading> getAll(){
        return (List<TemperatureReading>) temperatureReadingCrudRepository.findAll();
    }

    // DELETE
    public void delete(int id){
        temperatureReadingCrudRepository.deleteById(id);
    }
}

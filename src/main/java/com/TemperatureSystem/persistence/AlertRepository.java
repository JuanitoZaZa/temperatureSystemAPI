package com.TemperatureSystem.persistence;

import com.TemperatureSystem.persistence.crud.AlertCrudRepository;
import com.TemperatureSystem.persistence.entity.Alert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlertRepository {
    private AlertCrudRepository alertCrudRepository;

    // CREATE / UPDATE
    public Alert save(Alert alert){
        return alertCrudRepository.save(alert);
    }

    // READ
    public List<Alert> getAll(){
        return (List<Alert>) alertCrudRepository.findAll();
    }

    // DELETE
    public void delete(int alertID){
        alertCrudRepository.deleteById(alertID);
    }
}

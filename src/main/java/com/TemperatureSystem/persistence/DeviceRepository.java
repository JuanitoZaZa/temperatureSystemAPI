package com.TemperatureSystem.persistence;

import com.TemperatureSystem.persistence.crud.DeviceCrudRepository;
import com.TemperatureSystem.persistence.entity.Device;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeviceRepository {
    private DeviceCrudRepository deviceCrudRepository;

    // CREATE / UPDATE
    public Device save(Device device){
        return deviceCrudRepository.save(device);
    }

    // READ
    public List<Device> getAll(){
        return (List<Device>) deviceCrudRepository.findAll();
    }

    // DELETE
    public void delete(int id){
        deviceCrudRepository.deleteById(id);
    }
}

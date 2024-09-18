package com.TemperatureSystem.web_controller;

import com.TemperatureSystem.domain.DeviceDomain;
import com.TemperatureSystem.domain.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping("/all")
    public List<DeviceDomain> getAll() {
        return deviceService.getAll();
    }

    @PostMapping("/save")
    public DeviceDomain save(@RequestBody DeviceDomain deviceDomain) {
        return deviceService.save(deviceDomain);
    }

    @DeleteMapping("/delete/{deviceID}")
    public void deleteById(@PathVariable int deviceID) {
        deviceService.deleteById(deviceID);
    }
}

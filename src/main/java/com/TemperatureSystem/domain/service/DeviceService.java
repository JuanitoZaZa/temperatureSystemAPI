package com.TemperatureSystem.domain.service;

import com.TemperatureSystem.domain.AlertDomain;
import com.TemperatureSystem.domain.DeviceDomain;
import com.TemperatureSystem.domain.repository.AlertDomainRepository;
import com.TemperatureSystem.domain.repository.DeviceDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    @Autowired
    private DeviceDomainRepository deviceDomainRepository;

    public List<DeviceDomain> getAll(){
        return deviceDomainRepository.getAll();
    }

    public DeviceDomain save(DeviceDomain deviceDomain) {
        return deviceDomainRepository.save(deviceDomain);
    }

    public void deleteById(int deviceID) {
        deviceDomainRepository.deleteById(deviceID);
    }
}

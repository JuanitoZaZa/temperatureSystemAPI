package com.TemperatureSystem.domain.service;

import com.TemperatureSystem.domain.DeviceDomain;
import com.TemperatureSystem.domain.TemperatureReadingDomain;
import com.TemperatureSystem.domain.repository.DeviceDomainRepository;
import com.TemperatureSystem.domain.repository.TemperatureReadingDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperatureReadingService {
    @Autowired
    private TemperatureReadingDomainRepository temperatureReadingDomainRepository;

    public List<TemperatureReadingDomain> getAll(){
        return temperatureReadingDomainRepository.getAll();
    }

    public TemperatureReadingDomain save(TemperatureReadingDomain temperatureReadingDomain) {
        return temperatureReadingDomainRepository.save(temperatureReadingDomain);
    }

    public void deleteById(int temperatureReadingID) {
        temperatureReadingDomainRepository.deleteById(temperatureReadingID);
    }
}

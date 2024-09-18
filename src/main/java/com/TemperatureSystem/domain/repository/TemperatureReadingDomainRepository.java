package com.TemperatureSystem.domain.repository;

import com.TemperatureSystem.domain.DeviceDomain;
import com.TemperatureSystem.domain.TemperatureReadingDomain;

import java.util.List;

public interface TemperatureReadingDomainRepository {
    List<TemperatureReadingDomain> getAll();
    TemperatureReadingDomain save(TemperatureReadingDomain temperatureReadingDomain);
    void deleteById(int temperatureReadingID);
}

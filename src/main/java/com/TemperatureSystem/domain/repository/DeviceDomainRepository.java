package com.TemperatureSystem.domain.repository;

import com.TemperatureSystem.domain.AlertDomain;
import com.TemperatureSystem.domain.DeviceDomain;

import java.util.List;

public interface DeviceDomainRepository {
    List<DeviceDomain> getAll();
    DeviceDomain save(DeviceDomain deviceDomain);
    void deleteById(int deviceID);
}

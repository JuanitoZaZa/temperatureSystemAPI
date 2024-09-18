package com.TemperatureSystem.domain.repository;

import com.TemperatureSystem.domain.AlertDomain;

import java.util.List;

public interface AlertDomainRepository {
    List<AlertDomain> getAll();
    AlertDomain save(AlertDomain alertDomain);
    void deleteById(int alertID);
}

package com.TemperatureSystem.domain.service;

import com.TemperatureSystem.domain.AlertDomain;
import com.TemperatureSystem.domain.repository.AlertDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertService {
    @Autowired
    private AlertDomainRepository alertDomainRepository;

    public List<AlertDomain> getAll(){
        return alertDomainRepository.getAll();
    }

    public AlertDomain save(AlertDomain alertDomain) {
        return alertDomainRepository.save(alertDomain);
    }

    public void deleteById(int alertID) {
        alertDomainRepository.deleteById(alertID);
    }
}

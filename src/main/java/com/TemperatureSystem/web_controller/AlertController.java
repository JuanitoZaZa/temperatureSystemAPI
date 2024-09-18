package com.TemperatureSystem.web_controller;

import com.TemperatureSystem.domain.AlertDomain;
import com.TemperatureSystem.domain.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/alerts")
public class AlertController {


    @Autowired
    private AlertService alertService;

    @GetMapping("/all")
    public List<AlertDomain> getAll() {
        return alertService.getAll();
    }

    @PostMapping("/save")
    public AlertDomain save(@RequestBody AlertDomain alertDomain) {
        return alertService.save(alertDomain);
    }

    @DeleteMapping("/delete/{alertID}")
    public void deleteById(@PathVariable int alertID) {
        alertService.deleteById(alertID);
    }

}

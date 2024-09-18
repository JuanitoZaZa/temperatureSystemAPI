package com.TemperatureSystem.persistence.mapper;

import com.TemperatureSystem.domain.AlertDomain;
import com.TemperatureSystem.persistence.entity.Alert;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {DeviceMapper.class})
public interface AlertMapper {
    @Mappings({
            @Mapping(source = "alertID", target = "alertID"),
            @Mapping(source = "message", target = "message"),
            @Mapping(source = "creationTime", target = "creationTime"),
            @Mapping(source = "device", target = "device")
    })
    AlertDomain toAlertDomain(Alert alert);

    @InheritInverseConfiguration
    Alert toAlert(AlertDomain alertDomain);
}

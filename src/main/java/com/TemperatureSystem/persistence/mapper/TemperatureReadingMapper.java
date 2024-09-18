package com.TemperatureSystem.persistence.mapper;

import com.TemperatureSystem.domain.TemperatureReadingDomain;
import com.TemperatureSystem.persistence.entity.TemperatureReading;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {DeviceMapper.class})
public interface TemperatureReadingMapper {
    @Mappings({
            @Mapping(source = "temperatureReadingID" , target = "temperatureReadingID"),
            @Mapping(source = "temperature", target = "temperature"),
            @Mapping(source = "readingTime", target = "readingTime"),
            @Mapping(source = "device" , target = "device")
    })
    TemperatureReadingDomain toTemperatureReadingDomain (TemperatureReading temperatureReading);

    @InheritInverseConfiguration
    TemperatureReading toTemperatureReading (TemperatureReadingDomain temperatureReadingDomain);
}

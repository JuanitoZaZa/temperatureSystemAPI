package com.TemperatureSystem.persistence.mapper;

import com.TemperatureSystem.domain.DeviceDomain;
import com.TemperatureSystem.persistence.entity.Device;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface DeviceMapper {
    @Mappings({
           @Mapping(source = "deviceID", target = "deviceID"),
           @Mapping(source = "nameDevice", target = "nameDevice"),
           @Mapping(source = "location", target = "location")
    })
    DeviceDomain toDeviceDomain(Device device);

    @InheritInverseConfiguration
    @Mapping(target = "temperatureReading", ignore = true)
    @Mapping(target = "alert", ignore = true)
    Device toDevice(DeviceDomain deviceDomain);
}

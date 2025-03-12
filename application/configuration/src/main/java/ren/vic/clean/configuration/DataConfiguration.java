package ren.vic.clean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ren.vic.clean.data.device.DeviceRepoImpl;
import ren.vic.core.usecase.IDeviceRepository;

@Configuration
public class DataConfiguration {

    @Bean
    public IDeviceRepository deviceRepository() {
        return new DeviceRepoImpl();
    }

}

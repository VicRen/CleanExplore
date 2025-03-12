package ren.vic.clean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ren.vic.core.usecase.GetDeviceUseCase;
import ren.vic.core.usecase.IDeviceRepository;
import ren.vic.core.usecase.IGetDeviceUseCase;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public IGetDeviceUseCase getDeviceUseCase(IDeviceRepository deviceRepository) {
        return new GetDeviceUseCase(deviceRepository);
    }
}

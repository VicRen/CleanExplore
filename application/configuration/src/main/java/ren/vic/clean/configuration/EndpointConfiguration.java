package ren.vic.clean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ren.vic.clean.rest.GetDeviceEndpoint;
import ren.vic.core.usecase.IGetDeviceUseCase;

@Configuration
public class EndpointConfiguration {

    @Bean
    public GetDeviceEndpoint getDeviceEndpoint(IGetDeviceUseCase getDeviceUseCase) {
        return new GetDeviceEndpoint(getDeviceUseCase);
    }
}

package ren.vic.clean.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ren.vic.core.entity.Device;
import ren.vic.core.usecase.IGetDeviceUseCase;

@RestController
public class GetDeviceEndpoint {

    public static final String API_PATH = "/device/{code}";

    private final IGetDeviceUseCase getDeviceUseCase;

    public GetDeviceEndpoint(IGetDeviceUseCase getDeviceUseCase) {
        this.getDeviceUseCase = getDeviceUseCase;
    }

    @RequestMapping(value = API_PATH, method = RequestMethod.GET)
    public DeviceDto getDeviceDto(@PathVariable String code) {
        return toDto(getDeviceUseCase.GetDevice(code));
    }

    private DeviceDto toDto(Device device) {
        return new DeviceDto(device.getName(), device.getCode());
    }
}

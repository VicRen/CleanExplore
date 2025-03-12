package ren.vic.core.usecase;

import ren.vic.core.entity.Device;

public class GetDeviceUseCase implements IGetDeviceUseCase {

    private final IDeviceRepository deviceRepository;

    public GetDeviceUseCase(IDeviceRepository IDeviceRepository) {
        this.deviceRepository = IDeviceRepository;
    }

    @Override
    public Device GetDevice(String code) {
        return deviceRepository.GetDevice(code);
    }
}

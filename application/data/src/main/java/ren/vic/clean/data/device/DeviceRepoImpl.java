package ren.vic.clean.data.device;

import ren.vic.core.entity.Device;
import ren.vic.core.usecase.IDeviceRepository;

public class DeviceRepoImpl implements IDeviceRepository {

    @Override
    public Device GetDevice(String code) {
        System.out.printf("getting device code=%s\n", code);
        return new Device("1", "testing-device");
    }
}

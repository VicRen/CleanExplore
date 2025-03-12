package ren.vic.core.usecase;

import ren.vic.core.entity.Device;

public interface IDeviceRepository {

    Device GetDevice(String code);
}

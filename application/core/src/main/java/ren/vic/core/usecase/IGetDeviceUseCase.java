package ren.vic.core.usecase;

import ren.vic.core.entity.Device;

public interface IGetDeviceUseCase {

    Device GetDevice(String code);
}

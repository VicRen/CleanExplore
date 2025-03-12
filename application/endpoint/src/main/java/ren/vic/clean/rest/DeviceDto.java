package ren.vic.clean.rest;

public class DeviceDto {

    private final String name;
    private final String code;

    public DeviceDto(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}

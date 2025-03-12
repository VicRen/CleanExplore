package ren.vic.core.entity;

public class Device {

    private final String code;
    private final String name;

    public Device(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Device{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

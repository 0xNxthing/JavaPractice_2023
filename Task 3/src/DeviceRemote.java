abstract class DeviceRemote {
    protected Device device;

    public DeviceRemote(Device device) {
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void installApp(String appName);
}

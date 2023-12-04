public class DeviceRemoteControl extends DeviceRemote{
    public DeviceRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.start();
    }

    @Override
    public void turnOff() {
        device.shutdown();
    }

    @Override
    public void installApp(String appName) {
        device.installApp(appName);
    }
}

public class SmartphoneFactory extends DeviceFactory{
    @Override
    Device createDevice() {
        return new Smartphone();
    }
}

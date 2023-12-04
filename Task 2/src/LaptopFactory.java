public class LaptopFactory extends DeviceFactory{
    @Override
    Device createDevice() {
        return new Laptop();
    }
}

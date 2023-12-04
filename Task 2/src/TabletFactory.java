public class TabletFactory extends DeviceFactory{
    @Override
    Device createDevice() {
        return new Tablet();
    }
}

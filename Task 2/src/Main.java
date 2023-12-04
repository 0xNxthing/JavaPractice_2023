// Разработайте программу для управления разными видами электронных устройств (смартфоны, планшеты, ноутбуки) с использованием абстрактной фабрики.

public class Main {
    public static void main(String[] args) {
        DeviceFactory smartphoneFactory = new SmartphoneFactory();
        DeviceFactory tabletFactory = new TabletFactory();
        DeviceFactory laptopFactory = new LaptopFactory();

        Device smartphone = smartphoneFactory.createDevice();
        Device tablet = tabletFactory.createDevice();
        Device laptop = laptopFactory.createDevice();

        smartphone.turnOn();
        tablet.turnOn();
        laptop.turnOn();

        smartphone.turnOff();
        tablet.turnOff();
        laptop.turnOff();
    }
}
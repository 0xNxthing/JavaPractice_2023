public class Laptop extends Device{
    @Override
    void turnOn() {
        System.out.println("Ноутбук включен");
    }
    @Override
    void turnOff() {
        System.out.println("Ноутбук выключен");
    }
}

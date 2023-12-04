public class Tablet extends Device{
    @Override
    void turnOn() {
        System.out.println("Планшет включен");
    }
    @Override
    void turnOff() {
        System.out.println("Планшет выключен");
    }
}

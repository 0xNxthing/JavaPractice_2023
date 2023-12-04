public class Smartphone extends Device{
    @Override
    void turnOn() {
        System.out.println("Смартфон включен");
    }
    @Override
    void turnOff() {
        System.out.println("Смартфон выключен");
    }
}

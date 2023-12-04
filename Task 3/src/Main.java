// Создайте программу для управления разными типами мобильных операционных систем (iOS, Android, HarmonyOS) с использованием паттерна "мост".

public class Main {
    public static void main(String[] args) {
        DeviceRemoteControl iosRemote = new DeviceRemoteControl(new IOS());
        DeviceRemoteControl androidRemote = new DeviceRemoteControl(new Android());
        DeviceRemoteControl harmonyOSRemote = new DeviceRemoteControl(new HarmonyOS());

        iosRemote.turnOn();
        iosRemote.installApp("Telegram");
        iosRemote.turnOff();

        androidRemote.turnOn();
        androidRemote.installApp("VK");
        androidRemote.turnOff();

        harmonyOSRemote.turnOn();
        harmonyOSRemote.installApp("Ozon");
        harmonyOSRemote.turnOff();
    }
}
public class IOS implements Device{
    @Override
    public void start() {
        System.out.println("iOS: Включение");
    }

    @Override
    public void shutdown() {
        System.out.println("iOS: Выключение");
    }

    @Override
    public void installApp(String appName) {
        System.out.println("iOS: Загрузка " + appName);
    }
}

public class Android implements Device{
    @Override
    public void start() {
        System.out.println("Android: Включение");
    }

    @Override
    public void shutdown() {
        System.out.println("Android: Выключение");
    }

    @Override
    public void installApp(String appName) {
        System.out.println("Android: Загрузка " + appName);
    }
}

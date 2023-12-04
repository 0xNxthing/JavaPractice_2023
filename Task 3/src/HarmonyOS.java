public class HarmonyOS implements Device{
    @Override
    public void start() {
        System.out.println("HarmonyOS: Включение");
    }

    @Override
    public void shutdown() {
        System.out.println("HarmonyOS: Выключение");
    }

    @Override
    public void installApp(String appName) {
        System.out.println("HarmonyOS: Загрузка " + appName);
    }
}

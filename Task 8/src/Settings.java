import java.util.HashMap;
import java.util.Map;

public class Settings {
    private Map<String, String> settings;

    public Settings() {
        this.settings = new HashMap<>();
        setDefaultSettings();
    }

    private void setDefaultSettings() {
        settings.put("Разрешение", "1920x1080");
        settings.put("Громкость", "80%");
        settings.put("Язык", "Русский");
        settings.put("Настройки графики", "Высокие");
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
        System.out.println("Настройка: " + key + " - " + value);
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void displaySettings() {
        System.out.println("Текущие настройки:");
        for (Map.Entry<String, String> entry : settings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

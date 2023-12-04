import java.util.HashMap;
import java.util.Map;

public class SettingsManager {
    private Map<String, Settings> playerSettings;

    public SettingsManager() {
        this.playerSettings = new HashMap<>();
    }

    public void saveSettings(String playerId, Settings gameSettings) {
        playerSettings.put(playerId, gameSettings);
        System.out.println("Настройки сохранены.");
    }

    public Settings loadSettings(String playerId) {
        if (playerSettings.containsKey(playerId)) {
            Settings savedSettings = playerSettings.get(playerId);
            System.out.println("Настройки восстановлены.");
            return savedSettings;
        } else {
            System.out.println("Настройки не найдены. Настройки вернулись к значениям по умолчанию.");
            return new Settings();
        }
    }
}

// Разработайте систему управления настройками видеоигры, позволяющую сохранять и восстанавливать настройки графики и управления.

public class Main {
    public static void main(String[] args) {
        SettingsManager settingsManager = new SettingsManager();

        Settings player1Settings = new Settings();
        player1Settings.setSetting("Громкость", "90%");
        settingsManager.saveSettings("Игрок 1", player1Settings);

        Settings player2Settings = new Settings();
        player2Settings.setSetting("Разрешение", "2560x1440");
        player2Settings.setSetting("Язык", "Английский");
        settingsManager.saveSettings("Игрок 2", player2Settings);

        Settings restoredPlayer1Settings = settingsManager.loadSettings("Игрок 1");
        Settings restoredPlayer2Settings = settingsManager.loadSettings("Игрок 2");

        System.out.println("\nИгрок 1 - Настройки после восстановления:");
        restoredPlayer1Settings.displaySettings();

        System.out.println("\nИгрок 2 - Настройки после восстановления:");
        restoredPlayer2Settings.displaySettings();
    }
}
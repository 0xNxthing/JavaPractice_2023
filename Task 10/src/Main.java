// Реализуйте паттерн "Фасад" для системы управления домашними устройствами, позволяющий включать и выключать свет, регулировать температуру и управлять аудиосистемой.

public class Main {
    public static void main(String[] args) {
        FacadeSystem homeAutomationFacade = new FacadeSystem();

        homeAutomationFacade.turnOnLights();
        homeAutomationFacade.turnOffLights();

        homeAutomationFacade.setTemperature(22);

        homeAutomationFacade.playMusic();
        homeAutomationFacade.stopMusic();
    }
}
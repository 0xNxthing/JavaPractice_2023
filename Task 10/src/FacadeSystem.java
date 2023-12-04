public class FacadeSystem {
    private LightSystem lightSystem;
    private TemperatureSystem temperatureControlSystem;
    private AudioSystem audioSystem;

    public FacadeSystem() {
        this.lightSystem = new LightSystem();
        this.temperatureControlSystem = new TemperatureSystem();
        this.audioSystem = new AudioSystem();
    }

    public void turnOnLights() {
        lightSystem.turnOn();
    }

    public void turnOffLights() {
        lightSystem.turnOff();
    }

    public void setTemperature(int temperature) {
        temperatureControlSystem.setTemperature(temperature);
    }

    public void playMusic() {
        audioSystem.playMusic();
    }

    public void stopMusic() {
        audioSystem.stopMusic();
    }
}

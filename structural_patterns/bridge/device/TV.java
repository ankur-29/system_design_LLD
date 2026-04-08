package structural_patterns.bridge.device;

public class TV implements Device {

    public void turnOn() {
        System.out.println("TV turned ON");
    }

    public void turnOff() {
        System.out.println("TV turned OFF");
    }

    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}
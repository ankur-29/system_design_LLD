package structural_patterns.bridge.device;

public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
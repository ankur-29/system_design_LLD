package structural_patterns.bridge.remote;

import structural_patterns.bridge.device.Device;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Muted");
    }
}
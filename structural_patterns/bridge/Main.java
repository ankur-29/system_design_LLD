package structural_patterns.bridge;

import structural_patterns.bridge.device.*;
import structural_patterns.bridge.remote.*;

public class Main {

    public static void main(String[] args) {

        Device tv = new TV();
        RemoteControl remote = new RemoteControl(tv);

        remote.powerOn();
        remote.setVolume(20);

        System.out.println("------");

        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);

        advancedRemote.powerOn();
        advancedRemote.mute();
    }
}

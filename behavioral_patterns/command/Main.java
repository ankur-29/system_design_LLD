package behavioral_patterns.command;

import behavioral_patterns.command.commands.*;
import behavioral_patterns.command.receiver.Light;
import behavioral_patterns.command.invoker.RemoteControl;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.pressUndo();

        System.out.println("------");

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.pressUndo();
    }
}
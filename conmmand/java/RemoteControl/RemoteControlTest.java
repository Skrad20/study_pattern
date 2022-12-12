package conmmand.java.RemoteControl;

import conmmand.java.Commands.GarageDoorOpenCommand;
import conmmand.java.Commands.LightOnCommand;
import conmmand.java.Object.GarageDoor;
import conmmand.java.Object.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);


        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();


    }
}

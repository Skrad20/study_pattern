package conmmand.java;

import conmmand.java.Commands.Command;
import conmmand.java.Commands.GarageDoorCloseCommand;
import conmmand.java.Commands.GarageDoorOpenCommand;
import conmmand.java.Commands.LightOffCommand;
import conmmand.java.Commands.LightOnCommand;
import conmmand.java.Commands.MacroCommand;
import conmmand.java.Commands.StereoOffWithCDCommand;
import conmmand.java.Commands.StereoOnWithCDCommand;
import conmmand.java.Object.GarageDoor;
import conmmand.java.Object.Light;
import conmmand.java.Object.Stereo;
import conmmand.java.RemoteControl.RemoteControl;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRommLight = new Light();
        Light kithenLight = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();


        LightOnCommand livingLightOnCommand = new LightOnCommand(livingRommLight);
        LightOffCommand livingLightOffCommand = new LightOffCommand(livingRommLight);

        LightOnCommand kithenLightOnCommand = new LightOnCommand(kithenLight);
        LightOffCommand kithenLightOffCommand = new LightOffCommand(kithenLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        remoteControl.setCommand(0, kithenLightOnCommand, kithenLightOffCommand);
        remoteControl.setCommand(1, livingLightOnCommand, livingLightOffCommand);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffWithCDCommand);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);

        Command[] partyOn = { lightOn, stereoOn};
        Command[] partyOff = { lightOff, stereoOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(4, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(4);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(4);
    }
}

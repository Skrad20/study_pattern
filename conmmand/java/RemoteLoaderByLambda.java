package conmmand.java;

import conmmand.java.Commands.Command;
import conmmand.java.Object.GarageDoor;
import conmmand.java.Object.Light;
import conmmand.java.Object.Stereo;
import conmmand.java.RemoteControl.RemoteControl;
import conmmand.java.RemoteControl.RemoteControlLambda;

public class RemoteLoaderByLambda {
    public static void main(String[] args) {
        RemoteControlLambda remoteControl = new RemoteControlLambda();
        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();
        
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();        
        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        Command stereoOnWithCD = () -> {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);     
        };        
        remoteControl.setCommand(3, stereoOnWithCD, stereo::off);
        remoteControl.setCommand(4, garageDoor::on, garageDoor::off);
                                   
    System.out.println(remoteControl);
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(1); 
    remoteControl.offButtonWasPushed(1);
    remoteControl.onButtonWasPushed(2);
    remoteControl.offButtonWasPushed(2);
    remoteControl.onButtonWasPushed(3);
    remoteControl.offButtonWasPushed(3);
}

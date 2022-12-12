package conmmand.java.Commands;

import conmmand.java.Object.Light;

public class LightOffCommand  implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }
    
    public void undo(){
        light.on();
    }
}
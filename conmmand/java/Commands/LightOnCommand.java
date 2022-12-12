package conmmand.java.Commands;

import conmmand.java.Object.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }
    
    public void undo(){
        light.off();
    }
}

package conmmand.java.Commands;

import conmmand.java.Object.GarageDoor;

public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.on();
    }
    
    public void undo(){
        garageDoor.off();
    }
}

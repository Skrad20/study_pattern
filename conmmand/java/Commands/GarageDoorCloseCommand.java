package conmmand.java.Commands;

import conmmand.java.Object.GarageDoor;

public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.off();

    }
    public void undo(){
        garageDoor.on();
    }
}
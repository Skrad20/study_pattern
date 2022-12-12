package conmmand.java.RemoteControl;

import conmmand.java.Commands.Command;
import conmmand.java.Commands.NoCommand;

public class RemoteControlLambda {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    public RemoteControlLambda() {
    onCommands = new Command[7];
    offCommands = new Command[7];
    for (int i = 0; i < 7; i++) {
        onCommands[i] = () -> { };
        offCommands[i] = () -> { return NoCommand(); }; 
    }    
    }


    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-----RemoteControl----\n");
        for (int i = 0; i < onCommands.length; i++){
            stringBuffer.append(
                "[slot " + i + "] " + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n"
            );
        }


        return stringBuffer.toString();
    }
    
}

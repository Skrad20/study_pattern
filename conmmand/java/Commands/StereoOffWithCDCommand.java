package conmmand.java.Commands;

import conmmand.java.Object.Stereo;

public class StereoOffWithCDCommand implements Command{
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.off();
    }
    public void undo(){
        stereo.on();
    }
    
}

package conmmand.java.Object;

public class Stereo {
    String str;
    int volume;
        
    public Stereo(){}

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void setCD(String str){
        this.str = str;
        
        System.out.println("CD: " + str);
    }
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume: " + volume);
    }
}

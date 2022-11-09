package decorator.java.src;

public abstract class Beverage {
    String description = "Unknow Beverage";
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}

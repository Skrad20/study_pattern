package singelton.java;

public class Singelton {
    private volatile static Singelton uniqueInstance;

    private Singelton(){};

    public static Singelton getInstance(){
        if (uniqueInstance == null){
            synchronized (Singelton.class) {    
                uniqueInstance = new Singelton();
            }
        }
        return uniqueInstance;
    }
}

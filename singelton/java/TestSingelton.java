package singelton.java;


public class TestSingelton {
    public static void main(String[] args) {
        Singelton test = Singelton.getInstance();

        System.out.println(1);
        Singelton test2 = Singelton.getInstance();
        System.out.println(2);
        System.out.println(3);
    }

}

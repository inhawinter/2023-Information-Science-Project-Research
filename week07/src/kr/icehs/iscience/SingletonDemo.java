package kr.icehs.iscience;

class Singleton{
    private static Singleton s = new Singleton();  // unique object
    private Singleton() {
        System.out.println("One Object Created!");
    }

    public static Singleton getInstance() {
        return s;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        //Singleton s = new Singleton();  // private access

        //System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance().toString());
    }
}

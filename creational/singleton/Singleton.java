package creational.singleton;

public class Singleton {
    private static Singleton single_instance = null;

    private Singleton(){
//        System.out.println("Hi I'm Singleton");
    }

    public static Singleton getInstance(){
        if (single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }
}

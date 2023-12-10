public class Main {
    public static void main(String args[]){
        SingletonClass singletonClass1 = SingletonClass.getSingletonInstance();
        System.out.println("Singleton object1 created");
        SingletonClass singletonClass2 = SingletonClass.getSingletonInstance();
        System.out.println("Singleton object2 created");

        //check
        if(singletonClass1.equals(singletonClass2)) {
            System.out.println("Object2 is the reference of object1");
        }
    }
}
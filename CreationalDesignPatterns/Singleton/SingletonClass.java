//double locking implementation
//volatile prevents from memory writes from reodering of instructions by CPU.
public class SingletonClass {
    private static SingletonClass singletonClassObject = null;

    private SingletonClass(){
    }

    public static SingletonClass getSingletonInstance(){
        if(singletonClassObject == null){
            synchronized (SingletonClass.class){
                if(singletonClassObject == null){
                    singletonClassObject = new SingletonClass();
                }
            }
        }
        return singletonClassObject;
    }
}
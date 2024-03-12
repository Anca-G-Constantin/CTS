class Singleton{
    //private static instance variables
    private static  Singleton instance;

    //private constructor to prevent instantiation from outside class
    private Singleton(){  };
    public static Singleton getInstance(){
        //check if the instance is null, create it if needed
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public void doSomething(){ System.out.println("do something");}

}

class MainEx{
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();
        singletonInstance.doSomething();
    }
}
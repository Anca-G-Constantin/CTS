//The singleton design pattern guarantees the existence of only one instance of a class and is designed to offer global access to that instance.
//In contrast, the parametric singleton design pattern aims to ensure that a class has a single instance corresponding to a specific set of parameter values.
//Similar to the basic singleton design pattern, it also facilitates global access to this unique instance.
//
//There are 2 types of instantiation;
//-Early Instantiation: creation of instance at load time.
//-Lazy Instantiation: creation of instance when required.
public class Singleton {
    // Private static instance variable
    private static Singleton instance = null;

    //prevents external classes from creating instances of it directly;
    private Singleton() {
    }

    // Public method to get the instance of the class
	//when you call Singleton.getInstance() it returns the same instance every time
	//there is only one instance of Singleton throughout the entire program
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and properties of the class
    public void displayMessage() {
        System.out.println("Singleton instance is created.");
    }
}


//Applicability
//use singleton design pattern when :
//-there must be exactly one instance of a class with the given parametres
//-the instances must be accessible to clients from a well-known access point
//
//Consequences:
//-the parametric singleton design pattern controls creation of parametrically defined instances.
//-reduced name space
//
//Implementation:
//1) unique mapping of parametres:
//(requires that there be a means to map the parametre space into the instance space)
//2)ensure unique instances
//3)fast retrival
//(the pattern must be able to look up instances from data structure)
//
//Summary:
//The parametric singleton pattern allows for one instance of a class for a given set of parameters.
//It provides a single point of global access to a class.Saves memory because object is not created at each request.
//Only single instance is reused again and again.
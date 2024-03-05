// PRINCIPII:
// KISS - keep it simple and stupid
// DRY - do not repeat yourself
// YAGNI - you ain't gonna need it
// SOLID - made from the following 5 :
// -Single Responsibility Principle (a class should have only one reason to change, meaning it should have only one responsibility.)
// -Open/Closed Principle (class should be open for extension but closed for modification)
// -Liskov Substitution Principle (Subtypes should be substitutable for their base types without altering the correctness of
// the program)
// -Interface Segregation Principle (A class should not be forced to implement interfaces it does not use)
// -Dependency Inversion Principle (High-level modules should not depend on low-level modules. Both should depend on abstractions)


//ex 1 for SRP
     class Details{
        public void printDetails(){

        }
    }
     class CalculateValue extends Vehicle {
    private double price;
        public double calculateValue(){
            return price*km;
        }
     }
    class Vehicle{
    private int number;
    private String name;
    protected double km;
     public  void addVehicle(){

    }
    }


    //ex 2 for OCP
    interface Value {
     double calculateVehicle();
    }

    class Car implements Value{
    private double km;
    @Override
        public double calculateVehicle()
    {
        return km*0.8;
    }
    }

class Bike implements Value{
    private double km;
    @Override
    public double calculateVehicle()
    {
        return km*0.5;
    }
}


//ex 3 for LSP
interface Height{
    void setHeight();
}
interface Width{
    void setWidth();
}

class Rectangle_LSP implements Height, Width{
    private double height;
    private double width;
    @Override
    public void setHeight() {

    }
    @Override
    public void setWidth() {

    }
}

class Square_LSP implements Height, Width{
    private double height;
    @Override
    public void setHeight() {

    }
    @Override
    public void setWidth() {

    }
}


//ISP ex 4

public interface Vehicle_withDoors{

    public void fuel();
    public void openDoors();
    public void drive();
    public void stop();
}

public interface Vehicle_withoutDoors{

    public void fuel();
    public void drive();
    public void stop();

}

public class Bike implements  Vehicle_withoutDoors{
    public void fuel(){...}
    public void drive(){...}
    public void stop(){...}
}

// DIP ex 5

public interface Engine{
     void start();
}

public class Car {
    private Engine engine;

    public Car(Engine e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}

public class PetrolEngine implements Engine{
    @java.lang.Override
    public void start() {...}
}

public class DieselEngine implements Engine{
    @java.lang.Override
    public void start() {...}
}


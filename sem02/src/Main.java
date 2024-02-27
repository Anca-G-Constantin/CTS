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

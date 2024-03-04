// 1 SRP

//before
class Report{
    public void generateReport(){
        //do a report
    }
    public void saveToFile(){
        //save
    }
}

//after
class Report_SRP{
    public void generateReport(){
        //generate
    }
}
class Report_saver{
    public void saveToFIle(){
        //save
    }
}

// 2 OCP

//before
class Rectangle {
    public double lenght;
    public double widht;
}
class Area{
    public double calcArea(Rectangle rect){
        return rect.lenght * rect.widht;
    }
}

//after
interface Shape{
    double calcArea();
}
class Rectangle_OCP implements Shape{
    private double lenght;
    private double width;

    @Override
    public double calcArea(){
        return lenght * width;
    }
}
class Circle implements Shape{
    private double radius;

    @Override
    public double calcArea(){
        return Math.PI * radius * radius;
    }
}

// 3 LSP

// 4 ISP

// 5 DIP
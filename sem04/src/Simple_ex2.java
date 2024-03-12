interface Shape{
    void draw();
}

class Square implements  Shape{
    @Override
    public void draw(){
        System.out.println("Square");
    }
}

class Circle implements  Shape{
    @Override
    public void draw(){
        System.out.println("Circle");
    }
}

class ShapeFactory {
    public static Shape createShape(String type){
        if("Square".equalsIgnoreCase(type)){
            return new Square();
        }else if("Circle".equalsIgnoreCase(type)){
            return new Circle();
        }else {
            throw new IllegalArgumentException("Invalid shape");
        }
    }
}

class MainEx2{
    public static void main(String[] args) {
        Shape square= ShapeFactory.createShape("Square");
        square.draw();

        Shape circle= ShapeFactory.createShape("Circle");
        circle.draw();
    }}

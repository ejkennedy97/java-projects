/*
Colorable Interface
Eastern Oregon University
CS 210 Homework 8
 */
public class Exercise13_07 {
    public static void main(String[] args) {
        GeometricObject[] objects = {new Square(2), new Circle(5), new Square(5), new Rectangle(3, 4), new Square(4.5)};

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Area is " + objects[i].getArea());
            if (objects[i] instanceof Colorable)
                ((Colorable)objects[i]).howToColor();
        }
    }
}

interface Colorable {
    void howToColor();
}

class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {   // constructor no-arg side 0
        this.side = 0;
    }

    public Square(double side) {   // constructor with side
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
class Circle extends GeometricObject{
        private double radius;

        public Circle(double radius){
            this.radius = radius;
        }

        @Override
        public double getArea(){
            return Math.PI * radius * radius;
        }
    }
class Rectangle extends GeometricObject{
        private double width;
        private double height;

        public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }
        @Override
        public double getArea(){
            return width * height;
        }
}

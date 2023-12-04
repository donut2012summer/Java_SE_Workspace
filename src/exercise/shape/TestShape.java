package exercise.shape;

public class TestShape {

    public static void main(String[] args){

        double radius = 2;
        // Initialize the Circle with radius
        Circle circle = new Circle(radius);

        double length = 2, width = 5;
        // Initialize the Rectangle with length and width
        Rectangle rectangle = new Rectangle(length, width);

        // cal and print
        System.out.println("Circle area : " + circle.calArea());
        System.out.println("Rectangle area : " + rectangle.calArea());

    }
}

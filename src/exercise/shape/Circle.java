package exercise.shape;

public class Circle implements Shape {

    private final double PI = 3.14;
    private double radius;

    public Circle(final double radius){
        this.radius = radius;
    }

    /*
    * Formula : radius * radius * PI
    * */
    @Override
    public double calArea(){
        return Math.pow(radius, 2) * PI;
    }

}

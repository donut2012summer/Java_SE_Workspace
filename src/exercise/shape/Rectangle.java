package exercise.shape;

public class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(final double length, final double width){
        this.length = length;
        this.width = width;
    }

    /*
    * implement the calArea()
    * */
    @Override
    public double calArea(){
        return length * width;
    }

}

public class Square extends Shape{
    public double side;

    public Square(double side){
        this.side=side;
    }
    @Override
    public double area() {
            return side * side;

     //   throw new IllegalArgumentException("Unknown shape: " + shape.getClass());
    }
    @Override
    public  double perimeter() {
            return 4 * side;
    }

}

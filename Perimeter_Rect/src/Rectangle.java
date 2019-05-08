public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width=width;
        this.height=height;
    }
    @Override
    public  double area() {
            return width * height;
    }
    @Override
    public  double perimeter() {
            return 2 * width + 2 * height;
    }
}

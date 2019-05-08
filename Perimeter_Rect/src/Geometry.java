

public class Geometry {

    public static void main(String[] args) {
        Shape c=null;
        if (args[1].equals("Circle")){
            double radius=Double.parseDouble(args[2]);
            c = new Circle(radius);
        } else if (args[1].equals("Rectangle")){
            int width=Integer.parseInt(args[2]);
            int height=Integer.parseInt(args[3]);
            c = new Rectangle(width,height);
        }else {
            double side=Double.parseDouble(args[2]);
            c = new Square(side);
        }
        if (args[0].equals("area")){
            System.out.println(c.area());
        }else {
            System.out.println(c.perimeter());
        }
    }
}
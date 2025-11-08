public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(12, 8);
        System.out.println("Area of rectangle: " + r.area());
        Circle c = new Circle(12);
        System.out.printf("Area of circle: %.2f", c.area());
    }
}
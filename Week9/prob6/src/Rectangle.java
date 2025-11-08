public class Rectangle extends Shape{
    int l;
    int b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    double area(){
        return l * b;
    }
}

public class Shape {

    static int area(int side){
        return side * side;
    }

    static int area(int length, int breadth){
        return length * breadth;
    }

    static double area(double radius){
        return (Math.PI * radius * radius);
    }
}


public class Main {
    public static void main(String[] args) {
        FRUIT apple = new FRUIT();
        apple.color = "Red";
        apple.taste = "Sweet";
        apple.price = 150;

        FRUIT orange = new FRUIT();
        orange.color = "Orange";
        orange.taste = "Sour and Sweet";
        orange.price = 60;

        FRUIT mango = new FRUIT();
        mango.color = "Green and Yellow";
        mango.taste = "Sweet";
        mango.price = 50;

        System.out.println("\nApple");
        apple.display();
        System.out.println("\nOrange");
        orange.display();
        System.out.println("\nMango");
        mango.display();
    }
}
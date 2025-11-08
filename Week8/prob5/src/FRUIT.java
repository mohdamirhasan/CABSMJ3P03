public class FRUIT {
    private String color;
    private String taste;
    private int price;

    FRUIT(){
        this("Unknown", "Unknown", 0);
    }

    FRUIT(String c){
        this(c, "Unknown", 0);
    }

    FRUIT(String c, String t){
        this(c, t, 0);
    }

    FRUIT(String c, String t, int p){
        color = c;
        taste = t;
        price = p;
    }

    void display(){
        System.out.println("Colour: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price + " Rs/kg");
    }
}

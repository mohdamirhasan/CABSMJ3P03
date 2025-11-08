public class FRUIT {
    private String color;
    private String taste;
    private int price;

    FRUIT(){
        color = "Unknown";
        taste = "Unknown";
        price = 0;
    }

    FRUIT(String c){
        color = c;
        taste = "Unknown";
        price = 0;
    }

    FRUIT(String c, String t){
        color = c;
        taste = t;
        price = 0;
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

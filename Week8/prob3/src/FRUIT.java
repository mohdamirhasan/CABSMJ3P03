public class FRUIT {
    private String color;
    private String taste;
    private int price;

    FRUIT(String c, String t, int p){
        color = c;
        taste = t;
        price = p;
    }

    void setDetails(String c, String t, int p){
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

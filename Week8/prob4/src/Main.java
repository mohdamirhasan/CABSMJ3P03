public class Main {

    public static void main(String[] args){
        FRUIT f = new FRUIT();
        f.display();
        FRUIT f1 = new FRUIT("Red");
        f1.display();
        FRUIT f2 = new FRUIT("Green", "Sour");
        f2.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Edible.Fruit.fruitDetails();
        Edible.Vegetable.vegetableDetails();

        Edible.Fruit f = new Edible.Fruit();
        f.fruitPackaging();

        Edible.Vegetable v = new Edible.Vegetable();
        v.vegetablePackaging();
    }
}

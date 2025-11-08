public class BuySomething implements Bike, Scooty{
    public void offer(){
        System.out.println("Offer is not valid.");
    }

    @Override
    public void details() {
        Bike.super.details();
        Scooty.super.details();
    }
}

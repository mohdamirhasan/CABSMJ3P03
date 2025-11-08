public interface Scooty {
    void offer();

    default void details(){
        System.out.println("Details of scooty");
    }
}

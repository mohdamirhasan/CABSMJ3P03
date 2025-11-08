public interface Printer {
    void connect();
    default void details(){
        System.out.println("Details of printer");
    }
}

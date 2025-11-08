public interface Scanner {
    void connect();
    default void details(){
        System.out.println("Details of scanner");
    }
}

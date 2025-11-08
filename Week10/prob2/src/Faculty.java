public class Faculty extends University {
    String nameF;

    public Faculty(String nameF) {
        this.nameF = "Unknown";
    }

    public Faculty(String name, int rank, String nameF) {
        super(name, rank);
        this.nameF = nameF;
    }

    void details(){
        super.display();
        System.out.println("Faculty of " + nameF);
    }
}

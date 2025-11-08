public class University {
    String name;
    int ranking;

    public University() {
        this.name = "Unknown";
        this.ranking = 0;
    }

    public University(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    void display(){
        System.out.println(name + ", Rank: " + ranking);
    }
}

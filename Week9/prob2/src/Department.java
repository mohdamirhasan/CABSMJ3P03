public class Department extends Faculty {
    String nameD;
    String chairman;

    public Department(String name, int rank, String nameF, String nameD, String chairman) {
        super(name, rank, nameF);
        this.name = name;
        this.nameD = nameD;
        this.chairman = chairman;
    }

    void details(){
        System.out.println("Department of " + nameD);
        System.out.println("Chairman: " + chairman);
    }

    void display(){
        super.details();
        details();
    }
}

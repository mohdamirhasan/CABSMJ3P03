public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Amir Hasan";

        p.address.House_No = "12B";
        p.address.Street   = "Green Street";
        p.address.City     = "Aligarh";
        p.address.State    = "UP";

        p.dob.Day   = "15";
        p.dob.Month = "08";
        p.dob.Year  = "2005";

        p.Display();
    }
}

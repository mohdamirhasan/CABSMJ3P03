public class Person {
    String name;
    String phone;
    Address address = new Address();
    DateOfBirth dob = new DateOfBirth();



    class Address{
        String House_No;
        String Street;
        String City;
        String State;

        void displayAddr(){
            System.out.println(House_No + ", " + Street + ", " + City + ", " + State);
        }
    }

    class DateOfBirth{
        String Day;
        String Month;
        String Year;

        void displayDOB(){
            System.out.println(Day + "-" + Month + "-" + Year);
        }
    }


    void Display(){
        System.out.println("Name: " + name);
        address.displayAddr();
        dob.displayDOB();
    }
}

public class Employee {
    String empName;
    String empId;
    Salary salary = new Salary();
    JoiningDate jd = new JoiningDate();


    class Salary{
        double basic;
        double hra;
        double pf;

        void displaySalary(){
            System.out.println("Basic: " + basic + ", HRA: " + hra + ", PF: " + pf);
        }
    }

    class JoiningDate{
        int day;
        int month;
        int year;

        void displayJoiningDate(){
            System.out.println("Joining Date: " + day + "-" + month + "-" + year);
        }
    }

    void displayEmployee(){
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        salary.displaySalary();
        jd.displayJoiningDate();
    }
}

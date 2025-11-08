//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.empName = "ABCD";
        e.empId = "SR123";

        e.salary.basic = 10000;
        e.salary.hra = 2000;
        e.salary.pf = 1500;

        e.jd.day = 10;
        e.jd.month = 9;
        e.jd.year = 2018;

        e.displayEmployee();
    }
}

//Create a class Employee (Data Members – empName, empId). Create two
//member inner classes:
//        Salary (Data Members – basic, hra, pf; Method – displaySalary() to print
//salary details)
//        JoiningDate (Data Members – day, month, year; Method –
//displayJoiningDate() to print joining date).
//In the Employee class, create a method displayEmployee() that prints the
//employee’s name, ID, salary details, and joining date.
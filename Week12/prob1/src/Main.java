//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int division (int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 1, 0, -1};
        for (int i = 0; i < arr.length; i++){
            try{
                System.out.println("100 / " + arr[i] + " : " + division(100, arr[i]));
            } catch (ArithmeticException e) {
                System.out.println("Denominator is 0, i.e. not defined, at index: " + i);
            }
        }
    }
}

//Write a program that calls a method that throws an exception of type
//ArithmeticException in a for loop at an undesirable situation (such as
//divide by zero or taking square root of negative number). Catch the
//exception and display appropriate message. (Example of Unhecked
//Exception).
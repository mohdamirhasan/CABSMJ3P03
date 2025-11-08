import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3, 5, 2, 8, 6, 1};
        System.out.print("Enter element to search: ");
        int num = sc.nextInt();
        boolean isPresent = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num) {
                System.out.println("Element " + num + " is present at " + i + " index.");
                isPresent = true;
            }
        }
        if (!isPresent)
            System.out.println("Element " + num + " is not present in the array.");
    }
}
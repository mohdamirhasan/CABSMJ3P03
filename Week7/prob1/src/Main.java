import java.util.Scanner;

public class Main {
    static int binarySearch(int arr[], int num){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == num)
                return mid;
            else if (arr[mid] < num)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 3, 5, 6, 7, 8};
        System.out.print("Enter number to search: ");
        int num = sc.nextInt();
        int index = binarySearch(arr, num);
        if(index != -1)
            System.out.println("The element is present at " + index + " index.");
        else
            System.out.println("Element is not present in the array.");
    }
}
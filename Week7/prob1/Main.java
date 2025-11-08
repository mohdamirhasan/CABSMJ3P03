import java.util.Scanner;

public class Main {
    
    public static int binarySearch(int arr[], int low, int high, int num){
        if (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] == num){
                return mid;
            }
            else if (arr[mid] > num){
                return binarySearch(arr, low, mid-1, num);
            }
            else if (arr[mid] < num){
                return binarySearch(arr, mid+1, high, num);
            }
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4, 5, 2, 8, 9, 1};
        int low = 0;
        int high = arr.length - 1;
        System.out.print("Enter element: ");
        int num = sc.nextInt();
        int index = binarySearch(arr, low, high, num);
        System.out.println(index);
    }
}
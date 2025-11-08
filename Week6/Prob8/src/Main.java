
public class Main {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 8, 5, 6, 9};
        int max = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[max])
                max = i;
        }
        int temp = arr[0];
        arr[0] = arr[max];
        arr[max] = temp;

        int secondMax = 1;
        for (int i = 2; i < arr.length; i++){
            if (arr[i] > arr[secondMax])
                secondMax = i;
        }
        System.out.println("The second maximum element is: " + arr[secondMax]);
    }
}
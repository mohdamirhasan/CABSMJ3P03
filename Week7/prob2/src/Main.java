//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void bubbleSort(int arr[], int len){
        for (int i = 0; i < len - 1; i++){
            for (int j = 0; j < len - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 1, 8, 9};
        bubbleSort(arr, arr.length);
        for (int e: arr){
            System.out.print(e + " ");
        }
    }
}
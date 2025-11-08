
public class Main {
    public static void main(String[] args) {
        int a[] = {1, 9, 3, 8, 7};
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += a[i];
        }
        System.out.println("Sum of all the elements: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        int a[] = {12, 14, 19, 23, 15};
        int n = a.length;
        int max = a[0];
        for (int i = 1; i < n; i++){
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Maximum element: " + max);
    }
}
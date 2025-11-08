public class Main {
    public static void main(String[] args) {
        int a[] = {9, 5, 1, 7, 3};
        int len = a.length;
        int temp = a[0];
        a[0] = a[len - 1];
        a[len - 1] = temp;

        for (int e:a){
            System.out.print(e + " ");
        }
    }
}
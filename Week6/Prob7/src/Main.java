
public class Main {
    public static void main(String[] args) {
        for (int j = 2; j <= 100; j++){
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(j); i++){
                if (j % i == 0){
                    isPrime = false;
                }
            }
            if (isPrime)
                System.out.print(j + " ");
        }
    }
}
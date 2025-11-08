public class MathOperations {

    static int findGCD(int a, int b){
        if (a < b){
            a = a + b;
            b = a - b;
            a = a - b;
        }

        while ( b != 0 ){
            int rem = a % b;
            a = b;
            b = rem;
        }

        return a;
    }

    static int findLCM(int a, int b){
        return (a * b)/findGCD(a, b);
    }
}

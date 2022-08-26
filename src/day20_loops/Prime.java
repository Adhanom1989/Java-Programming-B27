package day20_loops;

public class Prime {
    public static void main(String[] args) {

        int n = 11;
        boolean isPrime = true;

        /*
        if(n < 2){
        System.out.println("Not Prime");
        System.exit(0); // stop the program
        }
         */

        for (int i = 2; i < n; i++) {

            if (n % i == 0){
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}

public class PrimeNumbers {

    public static void main(String[] args) {
        int n = 50; // You can change n to any desired upper limit
        System.out.println("Prime numbers from 1 to " + n + " are:");
        printPrimes(n);
    }

    public static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
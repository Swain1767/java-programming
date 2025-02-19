import java.util.Scanner;

public class NeonNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isNeonNumber(number)) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }
    }

    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sumOfDigits = 0;

        while (square > 0) {
            int digit = square % 10;
            sumOfDigits += digit;
            square /= 10;
        }

        return sumOfDigits == num;
    }
}
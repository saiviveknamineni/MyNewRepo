import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }

        int num = sc.nextInt();
        sc.close();

        if (num <= 1) {
            System.out.println(num + " is not prime.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(num + (isPrime ? " is prime." : " is not prime."));
    }
}
JAVA CODE HAS BEEN ADDED

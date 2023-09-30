package muzeebha;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Print the sequence from 1 to the input number
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print the pattern
        for (int i = 2; i <= number; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print("  "); // Two spaces for alignment
            }
            System.out.print(number - i + 2);
            System.out.println();
        }

        // Print the sequence from the input number to 1
        for (int i = number; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

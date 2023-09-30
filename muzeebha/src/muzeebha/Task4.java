package muzeebha;
public class Task4 {
    public static void main(String[] args) {
        int n = 10; // Starting point
        int m = 30; // Ending point
        int k = 3;  // Finding value
        
        if (n <= m) {
            for (int i = n; i <= m; i++) {
                if (sumOfDigits(i)== k) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Condition: n <= m");
        }
    }

    // Function to calculate the sum of digits of a number
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
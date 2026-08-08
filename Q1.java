import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your 4-digit PIN: ");
        int pin = sc.nextInt();

        // Count the number of digits using a loop
        int temp = pin;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Check if the PIN has exactly 4 digits
        if (count == 4) {
            System.out.println("VALID PIN");
        } else {
            System.out.println("INVALID PIN");
        }

        sc.close();
    }
}

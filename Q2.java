import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days the book is late: ");
        int days = sc.nextInt();

        int fine;

        // Calculate fine using conditional statements
        if (days <= 0) {
            fine = 0;   // No fine
        } else {
            fine = days * 5;   // Rs. 5 per day late
        }

        if (fine > 0) {
            System.out.println("Fine: Rs." + fine + "/-");
        } else {
            System.out.println("No fine. Book returned on time.");
        }

        sc.close();
    }
}

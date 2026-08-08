import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age (as text): ");
        String ageText = sc.nextLine();

        int age = Integer.parseInt(ageText);

        if (age >= 18) {
            System.out.println("Eligible to vote. Age: " + age);
        } else {
            System.out.println("Not eligible to vote. Age: " + age);
        }

        Integer ageObject = Integer.valueOf(age);  
        System.out.println("Wrapper object value: " + ageObject);

        sc.close();
    }
}

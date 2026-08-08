import java.util.Scanner;

class User {
    private String password;

    User(String pwd) {
        password = pwd;
    }

    boolean checkPassword(String input) {
        return password.equals(input);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User u = new User("secret123");   

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (u.checkPassword(pass)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Wrong Password");
        }

        sc.close();
    }
}

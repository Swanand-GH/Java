class Account {
    String name;
    double balance;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void transfer(Account other, double amount) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
            other.balance = other.balance + amount;
            System.out.println("Transfer of Rs." + amount + " from " + this.name + " to " + other.name + " successful.");
        } else {
            System.out.println("Transfer failed! Insufficient balance in " + this.name + "'s account.");
        }
    }

    void showBalance() {
        System.out.println(name + " has balance: Rs." + balance);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Account a1 = new Account("Amit", 5000);
        Account a2 = new Account("Sara", 2000);

        a1.showBalance();
        a2.showBalance();

        a1.transfer(a2, 1500);

        a1.showBalance();
        a2.showBalance();

        a1.transfer(a2, 10000);
    }
}

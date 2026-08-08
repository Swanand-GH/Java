class Cart {
    double calculateTotal(double price) {
        return price;
    }

    double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    double calculateTotal(double price, int quantity, double discountPercent) {
        double total = price * quantity;
        double discount = total * (discountPercent / 100);
        return total - discount;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Cart cart = new Cart();

        System.out.println("Single item (Rs.100): Rs." + cart.calculateTotal(100));

        System.out.println("5 items of Rs.100: Rs." + cart.calculateTotal(100, 5));

        System.out.println("5 items of Rs.100 with 10% discount: Rs." + cart.calculateTotal(100, 5, 10));
    }
}

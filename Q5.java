class Driver {
    String name;
    boolean available;

    Driver(String name, boolean available) {
        this.name = name;
        this.available = available;
    }

    void showStatus() {
        String status = available ? "Available" : "Busy";
        System.out.println("Driver " + name + " is " + status);
    }
}

class Trip {
    String tripId;
    Driver driver;   
    Trip(String tripId, Driver driver) {
        this.tripId = tripId;
        this.driver = driver;
    }

    void startTrip() {
        System.out.println("Starting " + tripId + " with driver " + driver.name);
        driver.available = false;   
    }
}

public class Q5 {
    public static void main(String[] args) {

        Driver d = new Driver("Rohan", true);
        d.showStatus();

        Trip trip1 = new Trip("Trip-101", d);
        Trip trip2 = new Trip("Trip-102", d);

        trip1.driver.showStatus();
        trip2.driver.showStatus();

        trip1.startTrip();

        System.out.println("After starting trip1:");
        trip1.driver.showStatus();
        trip2.driver.showStatus();
        d.showStatus();
    }
}

class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    // Static nested class: engine spec does not depend on a car object
    static class Engine {
        String type;
        int hp;

        Engine(String type, int hp) {
            this.type = type;
            this.hp = hp;
        }

        void showEngine() {
            System.out.println("Engine Type: " + type + ", Horsepower: " + hp);
        }
    }

    void showCar() {
        System.out.println("Car Model: " + model);
    }
}

public class Q9 {
    public static void main(String[] args) {
        // Create Engine using outer class name (no Car object needed)
        Car.Engine engine = new Car.Engine("V8", 400);
        engine.showEngine();

        // Create a Car independently
        Car c1 = new Car("Sedan");
        c1.showCar();

        // Same engine spec can be used for any car
        Car c2 = new Car("SUV");
        c2.showCar();
    }
}

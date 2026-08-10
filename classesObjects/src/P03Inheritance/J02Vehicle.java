package P03Inheritance;

class Vehicle {
    String type = "Four wheeler";

    void showType() {
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {
    String brand = "BMW";

    void showBrand() {
        System.out.println("Car brand: " + brand);
    }
}

public class J02Vehicle {
    public static void main(String args[]) {
        Car c = new Car();
        c.showType();
        c.showBrand();
    }
}

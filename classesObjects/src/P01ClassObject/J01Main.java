package P01ClassObject;

class Car {
    String color;
    String model;

    void display() {
        System.out.println("Color: " + this.color);
        System.out.println("Model: " + this.model);
    }
}

public class J01Main {
    public static void main(String args[]) {
        Car c = new Car();
        c.color = "red";
        c.model = "BMW";
        c.display();
    }
}

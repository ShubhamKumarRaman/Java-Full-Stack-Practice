package P01ClassObject;

class Car2 {
    String color;
    String model;

    public Car2() {
        this.color = "White";
        this.model = "Basic";
    }

    public Car2(String c) {
        this.color = c;
        this.model = "Basic";
    }

    public Car2(String c, String m) {
        this.color = c;
        this.model = m;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("=".repeat(20));
    }
}

public class J03Car {
    public static void main(String args[]) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("Red");
        Car2 c3 = new Car2("Green", "BMW");

        c1.display();
        c2.display();
        c3.display();
    }
}

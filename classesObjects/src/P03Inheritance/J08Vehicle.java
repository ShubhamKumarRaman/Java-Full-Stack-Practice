package P03Inheritance;

class Vehicle2 {
    String color;
    int speed;

    void displayBasicInfo() {
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed);
    }
}

class Car2 extends Vehicle2 {
    boolean AcAvailable;

    void displayAC() {
        System.out.println("AC available: " + AcAvailable);
    }
}

public class J08Vehicle {
    public static void main(String args[]) {
        Car2 c = new Car2();

        c.color = "Black";
        c.speed = 120;
        c.AcAvailable = true;

        c.displayBasicInfo();
        c.displayAC();
    }
}

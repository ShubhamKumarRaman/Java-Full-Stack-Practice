package P03Inheritance;

class Parent2 {
    void display() {
        System.out.println("Display Parent");
    }
}

class Child2 extends Parent2 {
    void display() {
        System.out.println("Display Child");
    }

    void show() {
        display();
        super.display();
        // display();
    }
}

public class J06Super {
    public static void main(String args[]) {
        Child2 obj = new Child2();
        obj.show();
    }
}

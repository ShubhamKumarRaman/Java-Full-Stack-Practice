package P03Inheritance;

class Parent2 {
    int value = 10;

    void display() {
        System.out.println("Display Parent");
    }
}

class Child2 extends Parent2 {
    int value = 20;

    void display() {
        System.out.println("Display Child");
    }

    void show() {
        display();
        super.display();
        // display();
    }

    void showValue() {
        System.out.println("Parent value: " + super.value);
        System.out.println("Child value: " + value);
    }
}

public class J06Super {
    public static void main(String args[]) {
        Child2 obj = new Child2();
        obj.show();
        obj.showValue();

        System.out.println(obj.value);
//        System.out.println(obj.super.value);
    }
}

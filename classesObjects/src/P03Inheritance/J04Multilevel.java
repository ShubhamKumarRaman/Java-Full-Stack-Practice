package P03Inheritance;

class GrandParent {
    void showMessage1() {
        System.out.println("GrandParent class");
    }
}

class Parent extends GrandParent {
    void showMessage2() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void showMessage3() {
        System.out.println("Child class");
    }
}

public class J04Multilevel {
    public static void main(String args[]) {
        Child obj = new Child();

        obj.showMessage1();
        obj.showMessage2();
        obj.showMessage3();
    }
}

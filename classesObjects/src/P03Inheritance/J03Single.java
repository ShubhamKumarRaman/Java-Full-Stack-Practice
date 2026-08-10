package P03Inheritance;

class First {
    public First() {
        System.out.println("First class is created");
    }

    void displayFirst() {
        System.out.println("This is First class method");
    }
}

class Second extends First {
    public Second() {
        System.out.println("Second class is created");
    }

    void displaySecond() {
        System.out.println("This is Second class method");
    }
}

public class J03Single {
    public static void main(String args[]) {
        Second s = new Second();
        s.displayFirst();
        s.displaySecond();
    }
}

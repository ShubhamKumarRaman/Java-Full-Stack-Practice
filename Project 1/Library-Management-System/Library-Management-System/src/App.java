import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=====Library Menu=====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Add DVD");
            System.out.println("4. View all items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int bId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String bTitle = sc.nextLine();

                    System.out.print("Enter Year: ");
                    int bYear = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    items.add(new Book(bId, bTitle, bYear, author, isbn));
                    System.out.println("Book added");
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int mId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String mTitle = sc.nextLine();

                    System.out.print("Enter Year: ");
                    int mYear = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Issue Number: ");
                    int issue = sc.nextInt();
                    sc.nextLine();

                    items.add(new Magazine(mId, mTitle, mYear, issue));
                    System.out.println("Magazine added.");
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int dId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String dTitle = sc.nextLine();

                    System.out.print("Enter year: ");
                    int dYear = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Duration (in Minutes): ");
                    int duration = sc.nextInt();

                    items.add(new DVD(dId, dTitle, dYear, duration));
                    System.out.println("DVD added!");
                    break;

                case 4:
                    if (items.isEmpty()) {
                        System.out.println("no items available.");
                    } else {
                        System.out.println("\n==== Library Items ====");
                        ;
                        for (LibraryItem item : items) {
                            item.displayInfo();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting....");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

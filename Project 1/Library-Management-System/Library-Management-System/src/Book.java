public class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(int id, String title, int year, String author, String isbn){
        super(id, title, year);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void displayInfo(){
        System.out.println("Book");
        System.out.println("ID: "+ getId());
        System.out.println("Title: "+getTitle());
        System.out.println("Year: "+getYear());
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+isbn);
        System.out.println("---------------------------------------");
    }
}

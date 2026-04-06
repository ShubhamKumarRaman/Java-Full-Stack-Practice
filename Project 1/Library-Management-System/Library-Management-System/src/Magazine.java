public class Magazine extends LibraryItem {

    private int issueNumber;

    public Magazine(int id, String title, int year, int issueNumber){
        super(id, title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo(){
        System.out.println("Magazine: ");
        System.out.println("ID: "+getId());
        System.out.println(("Title: "+getTitle()));
        System.out.println("Year: "+getYear());
        System.out.println("Issue Number: "+issueNumber);
        System.out.println("-----------------------");
    }
}

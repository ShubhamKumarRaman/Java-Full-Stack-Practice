public class DVD extends LibraryItem {
    private int durationMinutes;

    public DVD(int id, String title, int year, int durationMinutes){
        super(id, title, year);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public void displayInfo(){
        System.out.println("DVD");
        System.out.println("ID: "+getId());
        System.out.println("Title: "+getTitle());
        System.out.println("Year: "+getYear());
        System.out.println("Duration: "+durationMinutes+" minutes");
        System.out.println("------------------------------------------------");
    }
    
}

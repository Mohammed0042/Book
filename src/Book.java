public class Book {
    public String Name;
    public int Pages;
   // currentpage var public innan
    private int currentPage;
    public Book(String n,int P){
        this.Name = n;
        this.Pages = P;
        this.currentPage = 0;
    }
public void TurnPage(){
        if (currentPage < Pages) {
            currentPage++;
        }
        else {
            System.out.println("Du har läst alla sidor");
        }
        }

        public int getCurrentPage(){
        return currentPage;
        }

        public static void main(String[]args) {

            Book book1 = new Book("Diary Of A Wimpy Kid", 300);
            Book book2 = new Book("Harry Potter", 400);
            Book book3 = new Book("The Walking Dead", 200);

            System.out.println("Current Page För Diary Of A Wimpy Kid = " + book1.currentPage);

            book1.TurnPage();
            book1.TurnPage();

            System.out.println("Current Page För Diary Of A Wimpy Kid");

        }
}

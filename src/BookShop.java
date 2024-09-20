package src;

public class BookShop {
    int BookPrice;
    int BookYear;
    String BookName;
    String BookAuthor;

    public void BookPublished(){
        System.out.println("Book Has been Published");
    }

    public  void BookSold(){
        System.out.println("Book have been sold");
    }

    public static void main(String[] args) {
        BookShop books = new BookShop();

        books.BookPrice = 9000;
        books.BookYear = 2024;
        books.BookName = "Java";
        books.BookAuthor = "Dr Mrs olebara";

        System.out.println("The textbook price is sold at "+ books.BookPrice + " Niara");
        System.out.println("The book got published at the year"+ books.BookYear);
        System.out.println("The textbook Name is "+ books.BookName);
        System.out.println("The textbook Author's name is "+ books.BookAuthor);

        books.BookPublished();
        books.BookSold();
    }
}

import java.util.*;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int numberPages;

    public Book() {
        this("Unknown","Unknown",0,0f);
    }


    public Book(String title, String ISBN,  int numberPages, float price) {
        setTitle(title);
        setISBN(ISBN);
        setPrice(price);
        setNumberOfPages(numberPages);
    }

    public void setNumberOfPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String toString() {
        return "\n\nTITLE: " + title + "\nPRICE: " + price + "\nISBN: " + ISBN + "\nNUMBER OF PAGES: " + numberPages;
    }
}
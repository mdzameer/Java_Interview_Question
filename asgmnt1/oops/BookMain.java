package asgmnt1.oops;


//Constructor - 5. Constructor Overloading
//Problem: Create a class Book with two constructors: one accepts title and author, and the other accepts title, author, and price. Print the details of the book.
//Input:
//Book book1 = new Book("Java Basics", "John Doe");
//Book book2 = new Book("Advanced Java", "Jane Doe", 49.99);
//Output:
//Title: Java Basics, Author: John Doe, Price: Not Available
//Title: Advanced Java, Author: Jane Doe, Price: 49.99

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "John Doe");
        Book book2 = new Book("Advanced Java", "Jane Doe", 49.99);
        System.out.println(book1);
        System.out.println(book2);
    }
}

class Book{
    private String title;
    private String author;
    private double price;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public Book(String title,String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + (price==0.0 ? "Not available" : price) +
                '}';
    }
}

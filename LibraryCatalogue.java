import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String ISBN;

    public Book(String title, String author, int publicationYear, String ISBN) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
}

class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog() {
        this.books = new ArrayList<>();
    }

    // Add a book to the catalog
    public void addBook(Book bookArg) {
        books.add(bookArg);
    }

    // Display all books in the catalog
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library catalog is empty.");
        } else {
            System.out.println("Library Catalog:");
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }
}

public class LibraryCatalogue {
    public static void main(String[] args) {
        // Creating a LibraryCatalog
        LibraryCatalog libraryCatalogInstance = new LibraryCatalog();

        // Adding books to the catalog
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "9780061120084");

        libraryCatalogInstance.addBook(book1);
        libraryCatalogInstance.addBook(book2);

        // Display all books in the catalog
        libraryCatalogInstance.displayAllBooks();
    }
}
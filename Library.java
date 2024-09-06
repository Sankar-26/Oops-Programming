package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    Scanner obj = new Scanner(System.in);

    ArrayList<Book> books;
    //Library constructor to initialize Arraylist for Book class
    public Library() {
        this.books = new ArrayList<Book>();
    }

    //Method to add book details to the library system
    public void addBooks() {

        System.out.print("Enter BookID:");
        int bookId = obj.nextInt();
        System.out.print("Enter Title:");
        String title = obj.next();
        System.out.print("Enter Author Name:");
        String author = obj.next();

        books.add(new Book(bookId, title, author, true));
        System.out.println();
        System.out.println("Book detail is added to the library system.");
        System.out.println();

    }

    //Method to remove book detail from the library system
    public void removeBook(int x) {
        boolean flag = false;
        for (int i = 0; i < books.size(); i++) {

            if (x == books.get(i).getBookID()) {
                books.remove(i);
                System.out.println("BookId-" + x + " is removed.");
                System.out.println();
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Invalid Book_Id");
            System.out.println();
        }


    }

    //Method to search book detail from the library system
    public void searchBook(int id) {

        if (!books.isEmpty()) {
            for (int i = 0; i < books.size(); i++) {

                if (id == books.get(i).getBookID()) {
                    System.out.println(books.get(i).toString());
                    break;
                }
            }

            System.out.println();
        } else {
            System.out.println("No Books available in the library system to search.");
            System.out.println();
        }

    }

    //Method to display book details from the library system
    public void displayBook() {

        if (!books.isEmpty()) {
            for (Book b : books) {
                System.out.println(b);
            }

            System.out.println();
        } else {
            System.out.println("No Books available in the library system to display.");
            System.out.println();
        }

    }

}

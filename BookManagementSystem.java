package Q1;

import java.util.Scanner;

public class BookManagementSystem {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        Library library = new Library();
        int x;

        //Implemented a Menu-driven user interface to interact with the Library system using do while loop and switch case
        do {

            System.out.println("SELECT FROM THE BELOW INTERFACE TO INTERACT WITH THE LIBRARY SYSTEM");
            System.out.println("1.Add Book");
            System.out.println("2.Remove Book");
            System.out.println("3.Search Book");
            System.out.println("4.Display Book");
            System.out.println("5.Exit");
            System.out.println();
            System.out.print("Enter Input: ");
            x = obj.nextInt();

            switch (x) {
                case 1:
                    System.out.println("**Adding Book to the library system**");
                    library.addBooks();
                    break;

                case 2:
                    System.out.print("Enter the Book_Id to be removed: ");
                    library.removeBook(obj.nextInt());
                    break;

                case 3:
                    System.out.print("Enter the Book_Id to be searched: ");
                    library.searchBook(obj.nextInt());
                    break;

                case 4:
                    library.displayBook();
                    break;

                case 5:
                    System.out.println("Exiting the Library system");
                    break;

                default:
                    System.out.println("Enter Valid Input.");
                    System.out.println();
                    break;

            }

        } while (x != 5);


    }
}

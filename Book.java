package Q1;

public class Book {

    //Book attributes declaration
    public int bookID;
    public String title;
    public String author;
    public boolean isAvailable;

    //Constructor to initialize Book attributes
    public Book(int bookID, String title, String author, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    //Getter and setter for the Book attributes
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    //toString method to display the Book attributes
    @Override
    public String toString() {
        return "BookID=" + bookID +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Available=" + isAvailable;
    }
}

package ReadersOfLibrary;

public class Book extends Reader{
    String Name;
    String Author;

    public Book() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Book(String name, String author) {
        Name = name;
        Author = author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}

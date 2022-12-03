package ReadersOfLibrary;

public class Reader {
    String FIO;
    int NumberReadbook;
    String Facultet;
    int DateOfBirth;
    int number;
    int BooksTaken;
    int ReturnedBook;
    String book1;
    String book2;

    public String getBook1() {
        return book1;
    }

    public void setBook1(String book1) {
        this.book1 = book1;
    }

    public String getBook2() {
        return book2;
    }

    public void setBook2(String book2) {
        this.book2 = book2;
    }

    public int getReturnedBook() {
        return ReturnedBook;
    }

    public void setReturnedBook(int returnedBook) {
        ReturnedBook = returnedBook;
    }

    public int getBooksTaken() {
        return BooksTaken;
    }

    public void setBooksTaken(int booksTaken) {
        BooksTaken = booksTaken;
    }

    public Reader(){

    }

    public Reader(String FIO, int numberReadbook, String facultet, int dateOfBirth, int number) {
        this.FIO = FIO;
        NumberReadbook = numberReadbook;
        Facultet = facultet;
        DateOfBirth = dateOfBirth;
        this.number = number;
    }
    public void takeBook(String FIO, int BooksTaken){
        System.out.println(FIO + " взял книг в количестве: " + BooksTaken );
    }

    public void takeBook(String FIO, String book1, String book2){
        System.out.println(FIO + " взял книги: " + book1 + ", " + book2 );
    }

    public void takeBook(String FIO, String Book1, String Author1, String Book2, String Author2){
        System.out.println(FIO + " взял книги: " + Book1 + " под авторством: " +Author1 + " и " +  Book2 + " под авторством: " +Author2);
    }

    public void returnBook(String FIO, int ReturnedBook){
        System.out.println(FIO + " вернул книги в количестве:  " + ReturnedBook);
    }

    public void returnBook(String FIO, String book1, String book2){
        System.out.println(FIO + " вернул книги: " + book1 + ", " + book2 );
    }

    public void returnBook(String FIO, String Book1, String Author1, String Book2, String Author2){
        System.out.println(FIO + " вернул книги: " + Book1 + " под авторством: " +Author1 + " и " +  Book2 + " под авторством: " +Author2);
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getNumberReadbook() {
        return NumberReadbook;
    }

    public void setNumberReadbook(int numberReadbook) {
        NumberReadbook = numberReadbook;
    }

    public String getFacultet() {
        return Facultet;
    }

    public void setFacultet(String facultet) {
        Facultet = facultet;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}

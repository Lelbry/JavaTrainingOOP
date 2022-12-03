package ReadersOfLibrary;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Reader Rd1 = new Reader("Дудкин А.В.", 111,"Слизерин", 24052002, 8905131);
        System.out.println("Метод takeBook реализация 1: ");
        System.out.println("Сколько книг взял " + Rd1.FIO + " ?");
        Rd1.setBooksTaken(console.nextInt());
        Rd1.takeBook(Rd1.FIO, Rd1.BooksTaken);
        System.out.println(" ");

        System.out.println("Метод takeBook реализация 2: ");
        System.out.println("Введите название любых двух книг через Enter: ");
        Scanner consoleString = new Scanner(System.in);
        Rd1.setBook1(consoleString.next());
        Rd1.setBook2(consoleString.next());
        Rd1.takeBook(Rd1.FIO, Rd1.book1, Rd1.book2);
        System.out.println(" ");

        System.out.println("Метод takeBook реализация 3: ");
        Book book1 = new Book();
        Book book2 = new Book();
        System.out.println("Введите название первой книги: ");
        book1.setName(consoleString.next());
        System.out.println("Напишите фамилию автора первой книги: ");
        book1.setAuthor(consoleString.next());
        System.out.println("Введите название второй книги: ");
        book2.setName(consoleString.next());
        System.out.println("Напишите фамилию автора второй книги: ");
        book2.setAuthor(consoleString.next());
        Rd1.takeBook(Rd1.FIO, book1.Name, book1.Author, book2.Name, book2.Author);
        System.out.println(" ");

        System.out.println("Метод returnBook реализация 1: ");
        System.out.println("Сколько книг вернул " + Rd1.FIO + " ?");
        Rd1.setReturnedBook(console.nextInt());
        Rd1.returnBook(Rd1.FIO, Rd1.ReturnedBook);
        System.out.println(" ");

        System.out.println("Метод returnBook реализация 2: ");
        Rd1.returnBook(Rd1.FIO, Rd1.book1, Rd1.book2);
        System.out.println(" ");

        System.out.println("Метод returnBook реализация 3: ");
        Rd1.returnBook(Rd1.FIO, book1.Name, book1.Author, book2.Name, book2.Author);
    }
}

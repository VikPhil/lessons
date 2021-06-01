package viktor.com.library;
import java.util.Scanner;

public class Book {

    private String title = "Незнайка на луне";
    private String author = "Николай Носов";;
    private int yearOfPublication = 1965;;

    public Book() {

    }

    public Book(String title, String author, int publication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = publication;
    }

    public  Scanner getData() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        this.title = in.nextLine();
        System.out.print("Автор: ");
        this.author = in.nextLine();
        System.out.print("Год публикации: ");
        this.yearOfPublication = in.nextInt();

        return in;
    }

    public String toString() {
        return "Book title: " + title + '\n' +
                "Author: " + author + '\n' +
                "Year of publication: " + yearOfPublication;
    }
}

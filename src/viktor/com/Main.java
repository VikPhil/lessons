package viktor.com;

import viktor.com.lessonArrays.*;
import viktor.com.library.Book;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Book oneBook = new Book();
        System.out.println(oneBook.toString() + '\n');

        Book twoBook = new Book("Три мушкетера", "Александр Дюма", 1844);
        System.out.println(twoBook.toString());

        Book [] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            books[i].getData();
            System.out.println();
        }
        for (int j = 0; j < books.length; j++) {
            System.out.println(books[j].toString());
        }

    }
}

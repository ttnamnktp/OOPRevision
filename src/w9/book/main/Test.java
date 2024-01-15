package w9.book.main;

import w9.book.Book;
import w9.book.Chapter;
import w9.book.Page;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Page[] pages = new Page[100];
        for(int i = 0; i < 50; i++){
            pages[i] = new Page("Hi " + i,i + 1, "Chapter1");
        }
        for(int i = 50; i < 100; i++){
            pages[i] = new Page("Hi " + i,i + 1, "Chapter2");
        }

        Chapter chapter1 = new Chapter("Chapter1",1,"Book Name");
        Chapter chapter2 = new Chapter("Chapter2",2,"Book Name");

        for(int i = 0; i < 50; i++){
            chapter1.addPage(pages[i]);
        }
        for(int i = 50; i < 100; i++){
            chapter2.addPage(pages[i]);
        }

        Book book = new Book("Book Name", "", 10);
        book.addChapter(chapter1);
        book.addChapter(chapter2);
        System.out.println(book.getNumberOfChapter());
        System.out.println(book.getNumberOfPage());
    }
}

package w9.book;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {
    private String bookName;
    private String author;
    private double price;
    private ArrayList<Chapter> chapters;

    public Book(String bookName, String author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.chapters = new ArrayList<>();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    public boolean addChapter(Chapter chapter){
        if(chapter.getBookName().equals(this.bookName)){
            chapters.add(chapter);
            return true;
        }
        return false;
    }

    public int getNumberOfChapter(){
        return chapters.size();
    }

    public int getNumberOfPage(){
        int numberOfPage = 0;
        for(Chapter chapter : chapters){
            numberOfPage += chapter.getNumberOfPage();
        }
        return numberOfPage;
    }
}

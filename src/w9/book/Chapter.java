package w9.book;

import java.util.ArrayList;

public class Chapter {
    private String chapterName;
    private int chapterNumber;
    private String bookName;
    private ArrayList<Page> pages;

    public Chapter(String chapterName, int chapterNumber, String bookName) {
        this.chapterName = chapterName;
        this.chapterNumber = chapterNumber;
        this.bookName = bookName;
        this.pages = new ArrayList<Page>();
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public boolean addPage(Page page){
        if(page.getChapterName().equals(this.chapterName)){
            pages.add(page);
            return true;
        }
        return false;
    }

    public int getNumberOfPage(){
        return pages.size();
    }

}

package w9.book;

public class Page {
    private String content;
    private int pageNumber;
    private String chapterName;

    public Page(String content, int pageNumber, String chapterName) {
        this.content = content;
        this.pageNumber = pageNumber;
        this.chapterName = chapterName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }
}

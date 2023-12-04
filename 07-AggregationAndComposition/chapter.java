public class chapter {
    private String chapterTitle;
    private int numOfPages;
    private int StartingPage;
    public String getChapterTitle() {
        return chapterTitle;
    }
    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }
    public int getNumOfPages() {
        return numOfPages;
    }
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    public int getStartingPage() {
        return StartingPage;
    }
    public void setStartingPage(int startingPage) {
        this.StartingPage = startingPage;
    }

    public chapter(String chapterTitle, int numOfPages, int startingPage) {
        this.chapterTitle = chapterTitle;
        this.numOfPages = numOfPages;
        this.StartingPage = startingPage;
    }
    

}

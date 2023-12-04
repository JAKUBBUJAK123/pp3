import java.util.ArrayList;

public class Book {
    private String name;
    private int numOfpages;
    private Writer author;
    int page = 0;
    ArrayList<chapter> chapters = new ArrayList<>();
    public Book(String name, int numOfpages, Writer author) {
        this.name = name;
        this.numOfpages = numOfpages;
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumOfpages() {
        return numOfpages;
    }
    public ArrayList<chapter> getChapters(){
        return chapters;
    }

    public void setNumOfpages(int numOfpages) {
        this.numOfpages = numOfpages;
    }
    public Writer getAuthor() {
        return author;
    }
    public void setAuthor(Writer author) {
        this.author = author;
    }
    public void addPage(){
        this.page ++;
    }
    public void backPage(){
        if (this.page >0){  
            this.page --;
        }
    }
    public void addChapter(chapter chapter){
        if (chapter.getStartingPage() + chapter.getNumOfPages() <= this.numOfpages){
            chapters.add(chapter);
        }
        
    }
    public void removeChapter(chapter chapter){
        chapters.remove(chapter);
    }
    public static void main(String[] args) {
        Writer Salah = new Writer(68, "Salamalejko", "Kebab");
        Book RomeoAndJulia = new Book("Romeo and Julia", 200, Salah);
        RomeoAndJulia.addPage();
    }
}

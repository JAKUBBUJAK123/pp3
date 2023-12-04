import java.util.ArrayList;
public class bookcase {
    private ArrayList<Book> bookcase = new ArrayList<>();
    public void addBook(Book book){
        bookcase.add(book);
    }
    public void removeBook(Book book){
        bookcase.remove(book);
    }
    public void display(){
        for (int i = 0; i < bookcase.size(); i++) {
            System.out.println(bookcase.get(i).getChapters());
        }
    }
    public static void main(String[] args) {
        chapter cha1 = new chapter("seeing big dick", 100, 20);
        chapter cha2 = new chapter("twitch montage", 500, 1100);   
        Writer Salah = new Writer(68, "Salamalejko", "Kebab");
        Book kebab = new Book("miesane mieszane", 1000, Salah);
        Writer Messi = new Writer(40, "Ankara", "Argentina");
        Book beligol = new Book("beligol", 500, Messi);
        
        kebab.addChapter(cha2);
        kebab.addChapter(cha1);
        bookcase szafa = new bookcase();
        szafa.addBook(beligol);
        szafa.addBook(kebab);
        szafa.display();
    }
}


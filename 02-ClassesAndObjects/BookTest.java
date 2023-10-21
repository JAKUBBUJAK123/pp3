public class BookTest {
    public static void main(String[] args){
        book Lalka = new book();
        Lalka.page = 69;
        Lalka.BookName = "Lalka";
        Lalka.writePage();
        Lalka.nextPage();
        Lalka.nextPage();
        Lalka.nextPage();
        Lalka.writePage();
        lamp lamp = new lamp();
        lamp.isOn = true;
        lamp.switchlamp();
        lamp.printLamp();
    }
}

public class couterTest {
    public static void main(String[] args){
        counter one = new counter();
        for (int i = 0; i < 4; i++) {
            one.removeTen();
        }
        for (int j = 0; j < 7; j++) {
            one.removeOne();
        }
        one.printNr();
        counter sec = new counter();
        sec.addTen();
        sec.addTen();
        sec.addOne();
        sec.addOne();
        sec.addOne();
        sec.printNr();
    }
}

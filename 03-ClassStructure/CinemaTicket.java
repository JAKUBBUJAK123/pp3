public class CinemaTicket {
    static String name = "CinemaCity";
    static String title;
    static int row;
    static int seat;
    static int price;
    static String display(){
        String sentence = "Cinema name: " + name + " title: " + title + " row: " + Integer.toString(row) +" seat: " + Integer.toString(seat) + " price: " + Integer.toString(price);
        return sentence;
    }
}

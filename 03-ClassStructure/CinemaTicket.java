public class CinemaTicket {
    static String name = "CinemaCity";
    String title;
    int row;
    int seat;
    int price;
    String display(){
        String sentence = "Cinema name: " + name + " title: " + title + " row: " + Integer.toString(row) +" seat: " + Integer.toString(seat) + " price: " + Integer.toString(price);
        return sentence;
    }
    int createTicket(int row , int seat , String title){
        this.row = row;
        this.seat = seat;
        this.title = title;
        if (this.row<=2) {
            this.price = 10;

        }else{
            this.price = 25;
        }
        return price;
    }
}

public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    Room(int number){
        this.beds = 2;
        this.number = number;
        this.occupied = true;
    }
    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
        this.occupied = true;

    }
    public void checking(String guestName){
        this.guestName = guestName;
    }
    public void checkout(){
        this.occupied = false;
        this.guestName = "";
    }
    public void displey(){
        System.out.printf("Number:%d\nBeds:%d\nOccupied:%b\nGuest name:%s", this.number,this.beds,this.occupied,this.guestName);
    }

    public static void main(String[] args){
        Room [] rooms = new Room[4];
        rooms[0] = new Room(101);
        rooms[0].checking("Jakub");
        rooms[1] = new Room(102, 3);
        rooms[1].checking("Konrad");
        rooms[2] = new Room(104, 3);
        rooms[2].checking("Szczepan");
        rooms[3] = new Room(120);
        DisplayBeds(rooms ,3);
    }

    public static void DisplayBeds(Room[] rooms , int beds){
        for (int i = 0; i < rooms.length -1; i++) {
            if (rooms[i].beds == beds){
                rooms[i].displey();
            }
        }
    }
    

}
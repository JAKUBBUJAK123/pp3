public class Bus extends Vehicle {
    private int seats;
    private int size;
    private String sex;
    private int gear=0;
    @Override
    public boolean drive() {
        if (this.seats *10 >= this.size){
            return false;
        }
        return true;
    }
    @Override
    public void setGear(int gear) {
        if (this.sex != "woman"){
            this.gear = gear;
        }
        
    }
}

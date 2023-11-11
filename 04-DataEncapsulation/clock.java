public class clock {
    private int hour;
    private int minute;

    public clock(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }
    
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (hour >=0 && hour <=23){
        this.hour = hour;}
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        if (minute >=0 && minute <=59){
        this.minute = minute;}
    }
    public void addOneMinute(){
        if (minute ==59) {
            this.minute =0;
            if (hour ==23) {
                this.hour = 0;
            }else{this.hour ++;}
        }else{this.minute ++;}
    }
    public void display(){
        System.out.println(this.hour+":"+this.minute);
    }
    public static void main(String[] args){
        clock c = new clock(23, 57);
        c.addOneMinute();
        c.display();
        c.addOneMinute();
        c.display();
        c.addOneMinute();
        c.display();
        c.addOneMinute();
        c.display();
        c.addOneMinute();
        c.display();
        c.addOneMinute();
        c.display();
    }
}

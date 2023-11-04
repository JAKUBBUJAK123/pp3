public class clock {
    int hour = 0;
    int minute =0;
    int alarmHour;
    int alarmMinute;

    clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public void setClock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    public void setClock(){
        this.hour =0;
        this.minute = 0;
    }
    public void addOneMinute(){
        if (this.minute ==59) {
            this.minute = -1;
            if (hour == 23) {
                this.hour = -1;
            }this.hour ++;
        }this.minute ++;
        if (this.hour == this.alarmHour && this.minute == this.alarmMinute) {
            runAlarm();
        }
    }

    public void setAlarm(int hour, int minute){
        this.alarmHour = hour;
        this.alarmMinute = minute;
    }
    public void runAlarm(){
        System.out.println("Beep beep beep!!!!!!");
    }

    public void displayTime(){
        System.out.printf("%d:%d\n",this.hour,this.minute);
    }


    public static void main(String[] args){
        clock one = new clock(23, 58);
        one.setAlarm(23, 59);
        one.displayTime();
        one.addOneMinute();
        one.displayTime();
        one.addOneMinute();
        
    }


}

public class myCalendar {
    static int Year = 2023;
    static int Month = 11;
    static int Day = 22;

    static String myDate(){
        String date = Integer.toString(Year) + "-" + Integer.toString(Month) + "-" + Integer.toString(Day);
        return date;

    }
    static int Days(){
        int days = Month * 30 + 1* (Month/2) + Day;
        return days;
    }
    static String monthName(){
        String[] months = {"Styczen", "Luty","Marzec","Kwiecien","Maj","Czerwiec","Lipiec","Sierpien","Wrzesien","Pazdziernik","Listopad","Grudzien"};
        return months[Month-1];
    } 
}


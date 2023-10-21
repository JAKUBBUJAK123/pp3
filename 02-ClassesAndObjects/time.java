public class time {
    public static void main(String[] args){
        int hours = 14;
        int minutes = 57;
        System.out.printf(hours + ":" + minutes + "\n");
        System.out.printf("minutes past midnight: %d\n", hours *60);
        System.out.printf("seconds past midnight: %d\n" ,(hours *60 *60 + minutes*60));
    }
}

public class Height {
    public static void main(String[] args){
        double HeightCm = 180;
        double feet = 2.54;
        double HeightFeet = HeightCm/feet/12;
        System.out.println(Math.round(HeightFeet));
    }
}

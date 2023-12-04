import java.util.Random;

public class diagram {

    public static int getScore(){
        Random rand = new Random();
        int score = rand.nextInt(5) + 1;
        return score;
    }
    public static double averageScore(int[] arr){
        int maxValue = arr[0];
        int maxIndex = 0;
        int minValue = arr[0];
        int minIndex = 0;
        double avgscore =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> maxValue){
                maxValue = arr[i];
                maxIndex = i;
            }
            if (minValue > arr[i]) {
                minValue = arr[i];
                minIndex = i;
            }
        }int counter = 0;
        for (int j = 0; j < arr.length; j++) {
            if (j != maxIndex && j != minIndex) {
                avgscore += arr[j];
                counter ++;
            }    
            }avgscore = (double) avgscore / counter;
            return avgscore;
    }
    public static void main(String[] args) {
        int[] Judges = {getScore(),getScore(),getScore(),getScore(),getScore()};
        System.out.println(averageScore(Judges));
    }
    
}
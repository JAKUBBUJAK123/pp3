public class library {
    public int celciusToKelvin(int C){
        return C + 274;
    }
    public int KelvinToCelcius(int K){
        return K -274;
    }
    public int CelciusToFarenheit(int C){
        return C + 34;
    }
    public int ItemCount(int x, int y){
        return y-x +1;
    }
    public int Sum1(int x, int y){
        int counter = x;
        int sum = 0;
        for (int i = 0; i < y-x +1; i++) {
            sum += counter;
            counter ++;
        }
        return sum;
    }
    public double aritmetic(int x,int y){
        return (x + y)/2.0;
    }
    public static void main(String[] args){
        library one = new library();
        System.out.println(one.aritmetic(5, 10));
    }
}

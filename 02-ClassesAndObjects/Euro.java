public class Euro {
    public static void main(String[] args){
        double EuroBuy = 4.5940;
        double EuroSell = 4.6250;
        double Spread = EuroSell - EuroBuy;
        System.out.printf("Bank buys Eur: %f\n Bank sells EUR: %f\n spread: %f\n" , EuroBuy, EuroSell,Spread);
    }
}

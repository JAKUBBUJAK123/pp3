import java.util.Scanner;

public class InputTest {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        String text = object.nextLine();
        System.out.println(text);
        object.close();
    }
    
}
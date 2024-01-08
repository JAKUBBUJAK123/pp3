public class Isogram {
    public static boolean isogram(String text){
        for (int i = 0; i < text.length(); i++) {
            for (int j = i+1; j < text.length(); j++) {
                if(text.charAt(i) == text.charAt(j) && text.charAt(i) != ' '){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Isogram a = new Isogram();
        System.out.println(isogram("BLUE Sune"));
    }
}

public class Alphabet {
    
    static boolean isAlphabet(String t){
        t = t.toLowerCase();
    for (int i = 0; i < t.length()-1; i++) {
        if (t.charAt(i)> t.charAt(i+1)){
            return false;
        }
    }
    
        return true;
    
    }

    public static void main(String[] args){
        System.out.println(isAlphabet("aaabcdefg"));
    }
}


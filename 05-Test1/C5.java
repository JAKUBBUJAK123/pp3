public class C5 {
    public static String m(String t){
        if (t.length() == 1){
            return t;
        }
        String text = "";
        for (int i = 0; i < t.length(); i++) {
            if (i%2 == 0) {
                text += t.charAt(i);
                if(t.length()-1 > i){
                    text += "+";
                }
            }else{
                text += t.charAt(i);
                if(t.length()-1 > i){
                    text += "-";
                }
            }
        }return text;
    }
    public static void main(String[] args) {
        
        System.out.println(m("f"));
    }
}

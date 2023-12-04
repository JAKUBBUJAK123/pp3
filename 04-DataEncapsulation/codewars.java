public class codewars {
    public static String encode(String sentence){
        int couter = 0;
        int index =0;
        String text = sentence;
        while (index <sentence.length()-1){
            for (int i = index +1; i < sentence.length(); i++) {
                if (sentence.charAt(index) == sentence.charAt(i)) {
                    text.charAt(index) = ")";
                }
            }
        }

    }
    public static void main(String[] args) {
        System.out.println(encode("aaadjhsadjska"));
    }
}

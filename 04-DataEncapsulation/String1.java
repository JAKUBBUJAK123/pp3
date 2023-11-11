
public class String1 {
    private String string;
    
    public void setString(String string){
        this.string = string;
    }
    public String getString(){
        return string;
    }
    public int numOfCharacters(){
        return this.string.length();
    }
    public String characters(int number){
        return this.string.substring(0, number);
    }
    public boolean endsWitch(String suffix){
        return this.string.endsWith(suffix);
    }
    public boolean isEmpty(){
        if (this.string.length() > 0) {
            return true;
        }return false;
    }
    public int lasOccurence(char letter){
        for (int i = this.string.length()-1; i >=0; i--) {
            char a = this.string.charAt(i);
            if (a == letter) {
                return i;
            }
        }return 0;
    }
    public String replace(){
        String text = this.string;
        char minus = '-';
        text = text.replace(' ', minus);
        return text;
    }
    public String upperCase(){
        return this.string.toUpperCase();
    }


    
}

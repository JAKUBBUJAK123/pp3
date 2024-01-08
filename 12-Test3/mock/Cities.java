public class Cities {
    String[] names;
    public Cities(String[] names){
        this.names = names;
    }
    public String filter(char c){
        String text = "";
        for (int i = 0; i < this.names.length; i++) {
            if(this.names[i].charAt(0) == c){
                text += this.names[i];
            }
        }return text;
    }
    public static void main(String[] args) {
        String[] a = {"Sopot" , "Szczecin" , "Krakow" , "Warszawa"};
        Cities c = new Cities(a);
        System.out.println(c.filter('K'));
    }
}

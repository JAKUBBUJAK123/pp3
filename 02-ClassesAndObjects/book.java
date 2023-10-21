public class book {
    String BookName;
    int page;

    void nextPage(){
        page += 1;
    }
    void previousPage(){
        page -= 1;
    }
    void writePage(){
        System.out.println(page);
    }

}
    

public class counter {
    int nr;
    void addOne(){
        nr += 1;
    }
    void removeOne(){
        nr -= 1;
    }
    void addTen(){
        nr += 10;
    }
    void removeTen(){
        nr -= 10;
    }
    void reset(){
        nr = 0;
    }
    void printNr(){
        System.out.println(nr);
    }
}

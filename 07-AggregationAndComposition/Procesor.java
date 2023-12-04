public class Procesor {
    private int Ram;
    private int Herz;
    private String Mark;
    private boolean isWorking;
    public boolean isTurnedOn(){
        if (isWorking) {
            return true;
        }return false;
    }
    public void air(){
        System.out.println("brbrbrbrbrbrbbrbrr");
    }
    public Procesor(int ram, int herz, String mark, boolean isWorking) {
        Ram = ram;
        Herz = herz;
        Mark = mark;
        this.isWorking = isWorking;
    }
    public int getRam() {
        return Ram;
    }
    public void setRam(int ram) {
        Ram = ram;
    }
    public int getHerz() {
        return Herz;
    }
    public void setHerz(int herz) {
        Herz = herz;
    }
    public String getMark() {
        return Mark;
    }
    public void setMark(String mark) {
        Mark = mark;
    }
    public boolean isWorking() {
        return isWorking;
    }
    public void setWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }
    
}
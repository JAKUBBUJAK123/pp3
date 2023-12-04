public class Computer {
    private String monitor;
    private String mouse;
    private String keyboard;
    private Procesor Proc;
    public Computer(String m , String mo, String key, Procesor p){
        this.monitor = m;
        this.mouse = mo;
        this.keyboard = key;
        this.Proc = p;
    }
    public String getMonitor() {
        return monitor;
    }
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    public String getMouse() {
        return mouse;
    }
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
    public String getKeyboard() {
        return keyboard;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
    public Procesor getProc() {
        return Proc;
    }
    public void setProc(Procesor proc) {
        Proc = proc;
    }
    public void TurnOn(){
        System.out.println("Computer turned on");
    }
    public static void main(String[] args) {
        Computer Iron = new Computer("Iyama", "logitech", "SPC GK640", new Procesor(8, 140, "Intel", true));
        System.out.println(Iron.Proc.isTurnedOn());
    }
}

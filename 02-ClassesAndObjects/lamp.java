public class lamp {
    boolean isOn;

    void switchlamp(){
        if (isOn) {
            isOn = false;
        }
        else {
            isOn = true;}
    }
    void printLamp(){
        String result = (isOn) ? "Is on" : "Is off";
        System.out.println(result);
    }
}

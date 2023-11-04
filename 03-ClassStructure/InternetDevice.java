public class InternetDevice {
    String name;
    boolean isConnected;
    static int connectedDevices = 3;

    InternetDevice(String name){
        this.name = name;
    }
    public void connect(){
        this.isConnected = true;
    }
    public void disconnect(){
        this.isConnected = false;
    }
    public boolean isConnected(){
        if (this.isConnected){
            return true;
        }
        return false;
    }
    public void displayStatus(){
        System.out.printf("name: %s ,connected to internet: %b, connected devices: %d" , this.name,this.isConnected,connectedDevices);
    }
}
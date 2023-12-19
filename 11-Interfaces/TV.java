public class TV implements CanOnOff, CanChangeChannels, CanChangeVolume{
    int channel = 1;
    boolean isOn = false;
    int volumeLevel = 1;
    public int getChannel() {
        return channel;
    }
    @Override
    public void channelDown() {
        // TODO Auto-generated method stub
        if (this.channel >1 && isOn){
            this.channel --;
        }else{
            System.out.println("Cant lower the channel");
        }
        
    }
    @Override
    public void channelUp() {
        // TODO Auto-generated method stub
        if(this.channel <99 && isOn){
        this.channel ++;}
    }

    @Override
    public void setChannelNumber(int No){
        if (No >0 && No <100 && isOn){
            this.channel = No;
        }
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    @Override
    public void off() {
        // TODO Auto-generated method stub
        if (isOn){
            isOn = false;
        }
        else{
         System.out.println("Tv is already turned off");   
        }
        
    }
    @Override
    public void on() {
        // TODO Auto-generated method stub
        if (isOn == false){
            isOn = true;
        }
        else{
            System.out.println("Tv is already turned on");
        }

    }
    public void display(){
        System.out.println("Tv channel:" + this.channel + "is turned on : " + isOn + "Volume level: " + this.volumeLevel);
    }
    @Override
    public void volumeDown() {
        // TODO Auto-generated method stub
        if (isOn && this.volumeLevel > 1){
            this.volumeLevel --;
        }
        
    }
    @Override
    public void volumeUp() {
        // TODO Auto-generated method stub
        if (isOn && this.volumeLevel < 10){
            this.volumeLevel ++;
        }
        
    }
}

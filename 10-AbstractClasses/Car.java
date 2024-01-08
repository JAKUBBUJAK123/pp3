public class Car extends Vehicle {

        private int maxGear;
        private String name;
        private String sex;
        private int gear=0;
        

    public Car(int maxGear, String name, String sex) {
            this.maxGear = maxGear;
            this.name = name;
            this.sex = sex;
        }


    @Override
        public boolean drive() {
            if (this.sex== "woman"){
                return false;
            }
            return true;
        }


    @Override
    public void setGear(int gear) {
        if (this.maxGear > gear){
            this.gear = gear;
        }
        
    }
    
}

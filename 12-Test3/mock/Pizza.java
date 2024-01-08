public class Pizza extends Food implements Extra{
    @Override
    public float delivery() {
        if (getPrice() >30 ) {
            
        }
        return 0;
    }

    @Override
    public float delivery(int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float discount() {
        // TODO Auto-generated method stub
        return 0;
    }

    int size;

    public Pizza(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void setPrice(float price) {
        price = this.size - 10;
        
    }
}

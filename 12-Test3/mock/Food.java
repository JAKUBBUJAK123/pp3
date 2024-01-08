public abstract class Food {
    private String name;
    private float price;
    public Food(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public abstract void setPrice(float price);
        
    
}

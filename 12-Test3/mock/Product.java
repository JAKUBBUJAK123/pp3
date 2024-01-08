import java.util.Arrays;

public class Product implements Comparable<Product>{
    private String name;
    private float price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public int compareTo(Product o) {
        if(price == o.price){
            return 0;
        }
        else if(price > o.price){
            return -1;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Product[] arr = {new Product("Milk", 5), new Product("cheese", 2), new Product("ham", 9)};
        System.out.println(arr[0].getPrice());
        System.out.println(arr[1].getPrice());
        System.out.println(arr[2].getPrice());
        Arrays.sort(arr);
        System.out.println(arr[0].getPrice());
        System.out.println(arr[1].getPrice());
        System.out.println(arr[2].getPrice());
    }
    
    
}

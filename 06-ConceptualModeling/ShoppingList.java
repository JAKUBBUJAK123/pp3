import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;

public class ShoppingList {
    ArrayList<String> Products = new ArrayList<String>();
    ArrayList<String> ListOfProducts = new ArrayList<String>();

    public ShoppingList() {
        ListOfProducts.add("Mleko");
        ListOfProducts.add("Kox");
        ListOfProducts.add("Ser");
        ListOfProducts.add("Szynka");
        ListOfProducts.add("Mięso");
        ListOfProducts.add("Kurczak");
        ListOfProducts.add("Makaron");
        ListOfProducts.add("Dzem");
        ListOfProducts.add("Olej");
    }
    public void display(){
        System.out.println(this.Products);
    }
    public void displayNumberOfProducts(){
        System.out.println(this.ListOfProducts.size());
    }
    public void displayProducts(){
        System.out.println(this.ListOfProducts);
    }
    public void addProduct(String name){
        for (int i = 0; i < this.ListOfProducts.size(); i++) {
            if (name == this.ListOfProducts.get(i)){
                this.Products.add(this.ListOfProducts.get(i));
                this.ListOfProducts.remove(i);
            }
        }
    }
    public void addProduct(){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        for (int i = 0; i < this.ListOfProducts.size(); i++) {
            if (name == this.ListOfProducts.get(i)){
                this.Products.add(this.ListOfProducts.get(i));
                this.ListOfProducts.remove(i);
            }
        }System.out.println(name);
    }
    
    public static void main(String[] args) {
        ShoppingList customer = new ShoppingList();
        customer.display();
        customer.displayNumberOfProducts();
        customer.addProduct("Mleko");
        customer.addProduct("Kox");
        customer.addProduct("Ser");
        customer.addProduct();
        customer.display();
        customer.displayProducts();
    }

}

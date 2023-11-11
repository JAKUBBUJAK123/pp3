public class Products {
    String name;
    Boolean vegetarian;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getVegetarian() {
        return vegetarian;
    }
    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    @Override
    public String toString() {
        if (vegetarian){
            return "Products [name=" + name + ", vegetarian";
        }
        return "Products [name=" + name + ", not vegetarian";
    }

    
}

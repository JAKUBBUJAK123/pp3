public class Person {
    String name;
    int weight;
    int height;

    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    public void SetWeightAndHeight(int weight, int height) {
        this.weight = weight;
        this.height = height;    
    }
    public double calculateBmi() {
        double bmi = (this.height/10.0)*(this.height/1.0)/this.weight;
        return bmi;
    }
    public void display(){
        System.out.printf("name: %s , weight: %d , height: %d, bmi: %f" ,this.name ,this.weight,this.height,calculateBmi());
    }
    public static void main(String[] args) {
        Person one = new Person("Jakub");
        one.SetWeightAndHeight(77, 181);
        one.display();
    }
}


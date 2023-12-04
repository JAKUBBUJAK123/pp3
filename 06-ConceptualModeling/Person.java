class Person {
    int age;
    String name;
    String sex;
    Boolean isWorking;
public Person(int age, String name, String sex, Boolean isWorking) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.isWorking = isWorking;
    }
class customer extends Person{
    int Salary;
    String whatShop;
    String whatProduct;
    public customer(int age, String name, String sex, Boolean isWorking, int Salary, String whatShop, String whatProduct) {
        super(age, name, sex, isWorking);
        this.Salary = Salary;
        this.whatShop = whatShop;
        this.whatProduct = whatProduct;
    }
}    
public static void main(String[] args) {
    Person Jarek = new Person(23, "Jaerk","Men", true);
    
}
    
        
    
}

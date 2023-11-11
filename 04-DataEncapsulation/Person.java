public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isAdult(){
        if (this.age >= 18){
            return true;
        }return false;
    }
    public String toString(){
        return this.name + "," + this.age;
    }
    
}

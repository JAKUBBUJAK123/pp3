public class Writer {
    private int age;
    private String name;
    private String  nationality;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNationality() {
        return nationality;
    }
    public Writer(int age, String name, String nationality) {
        this.age = age;
        this.name = name;
        this.nationality = nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}

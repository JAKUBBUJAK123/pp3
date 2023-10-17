/**
 * StudentTest
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);
        Student a = new Student();
        a.age = 30;
        a.name = "Grzegorz";
        a.avgGrade = 5;
        a.id = "227442";
        a.isValid = true;
        a.semesterNum = 3;

        a.displayAge();
        a.displayName();
        a.sayHello();
        a.displayAvgGrade();
        a.displaySemester();
        a.changeStatus();
        
    }
    
}
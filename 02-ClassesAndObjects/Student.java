/**
 * Student
 */
public class Student {

    String name;
    int age;
    String id;
    boolean isValid;
    int semesterNum;
    int avgGrade;

    void sayHello() {
        System.out.println("Hello from " + name);
    }
    void displayName() {
        System.out.println("My name is : " + name);
    }
    void displayAge() {
        System.out.println("My age is : " + age);    
    }
    void displaySemester() {
        System.out.println("I'm on " + semesterNum + " semester");    
    }
    void displayAvgGrade() {
        System.out.println("My average grade is : " + avgGrade);    
    }
    void changeStatus() {
        if (isValid) {
            System.out.println("Invalid");
            isValid = false; 
        }
        else {

            System.out.println("Valid");
            isValid = true;
        }
    }

}

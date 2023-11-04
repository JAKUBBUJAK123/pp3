import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;


public class StudentGrades {
    String studentName;
    double[] grades;
    int rand;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int kid){
        this.rand = kid;

    }
    StudentGrades(String name){
        Scanner object = new Scanner(System.in);
        double grades = object.nextDouble();
        System.out.println(grades);
        object.close();
    }

    public double bestGrade(){
        double grade = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grade < grades[i]){
                grade = grades[i];
            }
        
        }
        return grade;
    }
    public double worstGrade(){
        double grade = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grade > grades[i]){
                grade = grades[i];
            }
        
        }
        return grade;
    }
    public int numOfGrades(){
        return this.grades.length;
    }

    public double[] generate(){
        DoubleStream num = new Random()
        .doubles(this.rand,1.0,5.0);
        double[] randgrades = num.toArray();
        return randgrades;
    }

    public void display(){
        System.out.println();
    }

    public static void main(String[] args){
        double [] gr = {1.0,2.0,3.0,4.0,5.0};
        StudentGrades one = new StudentGrades("Jakub", gr);
        System.out.println(one.generate());

        StudentGrades two = new StudentGrades("Jakub");

        
    }
}

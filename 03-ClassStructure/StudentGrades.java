import java.util.Random;
import java.util.Scanner;



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

    public double[] generate(){
        Random num = new Random();
        int randgrade = num.nextInt(5) + 1;
        double randgradedouble = (double) randgrade;
        double[] newGrades = new double[this.grades.length+1];
        newGrades[newGrades.length-1] = randgradedouble;
        return newGrades;
    }

    public void display(){
        System.out.println();
    }

    public static void main(String[] args){
        double [] gr = {1.0,2.0,3.0,4.0,5.0};
        StudentGrades one = new StudentGrades("Jakub", gr);
        System.out.println(one.generate());
        StudentGrades two = new StudentGrades("Jakub");
        one.generate();
        
    }
}

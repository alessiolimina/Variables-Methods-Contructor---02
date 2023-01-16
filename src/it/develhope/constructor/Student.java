package it.develhope.constructor;

public class Student {
public String name;
public int grade;
public Student(String studentName){
    this.name = studentName;
    System.out.println("Creating a new student! His name is " + studentName);
}
    public void getStudentDetails(){
        System.out.println("The student " + name + " has received the grade " + grade);
}

}






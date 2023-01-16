package it.develhope.constructor;

public class Student {
public String name;
public int grade;
public Student(String studentName){
    this.name = studentName;
    System.out.println("Creating a new student " + studentName);
}

    public void getStudentDetails(){
        System.out.println(name + ", that is in " + grade + " grade");
}

}






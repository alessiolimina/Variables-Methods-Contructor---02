package it.develhope.constructor;

public class Teacher {
public String teacherName;
public Teacher(){
    this.teacherName = "Stefano";
    System.out.println("Creating a new teacher! His name is " + teacherName);
}
public void assignGrade(Student alumn, int finalGrade){
    alumn.grade = finalGrade;
}

}

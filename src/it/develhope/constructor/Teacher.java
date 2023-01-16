package it.develhope.constructor;

public class Teacher {
public String teacherName;
public Teacher(){
    System.out.println("Creating a new teacher " + teacherName);
}

public String assignGrade(Student alum, int finalGrade){
    return "The teacher " + teacherName + " assigns to " + alum.getStudentDetails() + " the final grade " + finalGrade;
}

}




/**
 * A simple method for assigning a grade to a student
 * @param alum a Student object
 * @param finalGrade an int grade that the Teacher assigns to the Student
 */

/*define a class called Teacher that has:
a string instance variable called teacherName
a constructor method that simply inform the user about the creation of a Teacher object
a method assignGrade() that
takes 2 params:
alum of type Student
a int finalGrade
assigns finalGrade to the Student's grade
define a testing class where you:
create 2 students
create 1 teacher
assign a name to the teacher
assign grades to the 2 students
prints the students' details*/
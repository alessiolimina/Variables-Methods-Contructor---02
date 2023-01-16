package it.develhope.constructor;

public class Start {
    public static void main(String[] args) {

System.out.println("-------------STARTING--------------------");

Teacher teacher1 = new Teacher();
Student student1 = new Student("Fabrizio");
Student student2 = new Student("Giulio");

System.out.println("---------Assigning grades----------------");

teacher1.assignGrade(student1, 28);
student1.getStudentDetails();

System.out.println("-----------------------------------------");

teacher1.assignGrade(student2, 30);
student2.getStudentDetails();

System.out.println("-----------------------------------------");

    }
}


package ex08;

import ex08.GraduateStudent;
import ex08.StudentAtLarge;

public class StudentDemo {
    public static void main(String[] args){
        Student[] students = new Student[6];
        students[0] = new GraduateStudent(1111, "One");
        students[1] = new UndergraduateStudent(2222, "Two");
        students[2] = new StudentAtLarge(3333, "Three");
        students[3] = new GraduateStudent(4444, "Four");
        students[4] = new UndergraduateStudent(5555, "Five");
        students[5] = new StudentAtLarge(6666, "Six");
        for (int x = 0; x<students.length; ++x){
            System.out.println("ex08.Student ID number - "+students[x].getIdNum()+
                    "\n"+"ex08.Student Last Name - "+ students[x].getLastName() +
                    "\n"+"ex08.Student tuition fee - "+students[x].getTuition());
        }
    }
}

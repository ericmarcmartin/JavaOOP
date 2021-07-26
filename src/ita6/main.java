package ita6;

import ita6.class_and_object.Student;

import java.lang.*;

public class main {
    public static void main(String[] args) {
        Student student = new Student("Eric Marc Martin", 22, 'M', "123456");
        System.out.println(
                "Student info:" +
                        "\nFull Name: " + student.getStudentName() +
                        "\nAge: " + student.getStudentAge() +
                        "\nGender: " + student.getStudentGender() +
                        "\nID Number: " + student.getStudentIdNum());

    }
}

package ita6.class_and_object;

public class Student {
    public String studentName;
    public int studentAge;
    public char studentGender;
    public String studentIdNum;

    public Student(String studentName, int studentAge, char studentGender, String studentIdNum){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentIdNum = studentIdNum;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public char getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(char studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentIdNum() {
        return studentIdNum;
    }

    public void setStudentIdNum(String studentIdNum) {
        this.studentIdNum = studentIdNum;
    }
}

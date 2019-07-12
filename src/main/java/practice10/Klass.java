package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students;

    public Klass() {
        students = new ArrayList<>();
    }

    public Klass(int number) {
        this.number = number;
        students = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }


    public Student getLeader() {
        return leader;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void appendMember(Student student) {
        students.add(student);
    }

    public void assignLeader(Student student) {
        if (!students.contains(student))
            System.out.print("It is not one of us.\n");
        else this.leader = student;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public boolean isIn(Student student) {
        return students.contains(student);
    }

}

package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getLeader() {
        return leader;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void appendMember(Student student) {
        students.add(student);
        if(getTeacher()!=null)
            System.out.println(String.format("I am %s. I know %s has joined Class %d.", teacher.getName(), student.getName(), number));
    }

    public void assignLeader(Student student) {
        if (!students.contains(student))
            System.out.println("It is not one of us.\n");
        else {
            this.leader = student;
            if(getTeacher()!=null)
                System.out.println(String.format("I am %s. I know %s become Leader of Class %d.\n", teacher.getName(), student.getName(), number));
        }
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public boolean isIn(Student student) {
        return students.contains(student);
    }

}

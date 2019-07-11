package practice11;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher() {
        classes = new ArrayList<>();
    }

    public Teacher(List<Klass> classes) {
        this.classes = classes;
        setTeacher();
    }

    public Teacher(String name, int age, List<Klass> classes) {
        super(name, age);
        this.classes = classes;
        setTeacher();
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        setTeacher();
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        classes = new ArrayList<>();
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setTeacher() {
        for (Klass klass : classes)
            klass.setTeacher(this);
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student))
                return true;
        }
        return false;
    }

    @Override
    public String introduce() {
        StringBuffer sb = new StringBuffer();
        if (classes.size() != 0) {
            sb.append(" I teach Class ");
            for (int i = 0; i < classes.size(); i++) {
                System.out.println(classes.get(i).getNumber());
                sb.append(classes.get(i).getNumber() + (i == (classes.size() - 1) ? "." : ", "));
            }
        } else {
            sb.append(" I teach No Class.");
        }
        return super.introduce() + String.format(" I am a Teacher.%s", sb.toString());
    }

    public String introduceWith(Student student) {
        String doesTeach = (isTeaching(student)) ? ("I teach " + student.getName()) : ("I don't teach " + student.getName());
        return super.introduce() + " I am a Teacher. " + doesTeach + ".";
    }
}

package practice08;

import practice08.Klass;
import practice08.Person;

public class Student extends Person {
    private Klass klass;

    public Student() {
    }

    public Student(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String isLeader = klass.getLeader() != null && klass.getLeader().equals(this) ? ("I am Leader of " + klass.getDisplayName()) : ("I am at " + klass.getDisplayName());
        return super.introduce() + String.format(" I am a Student. %s.", isLeader);
    }
}

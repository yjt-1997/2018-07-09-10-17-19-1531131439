package practice07;

import practice07.Person;

public class Student extends Person {
    private Klass klass;

    public Student() {
    }

    public Student(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + String.format(" I am a Student. I am at %s.", klass.getDisplayName());
    }
}

package practice06;

import practice06.Person;

public class Student extends Person {
    private int klass;

    public Student() {
    }

    public Student(int klass) {
        this.klass = klass;
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + String.format(" I am a Student. I am at Class %d.", klass);
    }
}

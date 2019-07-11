package practice04;

import practice04.Person;

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
        return super.basicIntroduce() + String.format(" I am a Student. I am at Class %d.", klass);
    }
}

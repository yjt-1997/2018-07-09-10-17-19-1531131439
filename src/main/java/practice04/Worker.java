package practice04;

import practice04.Person;

public class Worker extends Person {

    public Worker() {
    }

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return super.basicIntroduce() + "My name is %s. I am %d years old. I am a Worker. I have a job.";
    }
}

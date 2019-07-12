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
        return super.basicIntroduce() + " I am a Worker. I have a job.";
    }
}

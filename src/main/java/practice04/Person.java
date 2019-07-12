package practice04;

public class Person {
    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String basicIntroduce() {

        return String.format("My name is %s. I am %d years old.", name, age);
    }

    public String introduce() {

        return basicIntroduce();
    }
}

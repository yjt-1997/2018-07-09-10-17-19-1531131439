package practice11;

public class Person {
    protected int id;
    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }

    public boolean equals(Object another) {
        if (id == ((Person) another).getId())
            return true;
        return false;
    }
}

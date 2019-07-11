package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(int klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String teachClass = (klass == 0) ? "No Class" : ("Class " + klass);
        return super.introduce() + String.format(" I am a Teacher. I teach %s.", teachClass);
    }
}

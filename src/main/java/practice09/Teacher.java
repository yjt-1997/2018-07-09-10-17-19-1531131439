package practice09;

public class Teacher extends Person {
    private Klass klass;

    public Teacher() {
    }

    public Teacher(Klass klass) {
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String teachClass = (klass == null) ? "No Class" : klass.getDisplayName();
        return super.introduce() + String.format(" I am a Teacher. I teach %s.", teachClass);
    }

    public String introduceWith(Student student) {
        String doesTeach = (student.getKlass().equals(klass)) ? ("I teach " + student.getName()) : ("I don't teach " + student.getName());
        return super.introduce() + " I am a Teacher. " + doesTeach + ".";
    }
}

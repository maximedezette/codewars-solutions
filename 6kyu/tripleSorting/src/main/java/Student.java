public class Student {

    private final int age;
    private final int gpa;
    private final String name;

    public Student(int age, int gpa, String name) {
        this.age = age;
        this.gpa = gpa;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getGpa() {
        return gpa;
    }

    public String getFullName() {
        return name;
    }
}

package arrayprograms;

public class ArrayStudent {
    public String name;
    public int grade;
    public int age;

    public ArrayStudent(String name, int grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {

        return grade;
    }

    public int getAge() {

        return age;
    }

    @Override
    public String toString() {
        return "ArrayStudent{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }
}

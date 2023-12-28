package arrayprograms;

public class Student {
    public int id;
    public String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//    public void display()
//    {
//        System.out.println("Student id is: " + id + " " + "and Student name is: " + name);
//
//        System.out.println();
//    }
//}

package Encapsulation;

public class Collage {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("durga");
        student.setEmail("durga@gmail.com");
        student.setAge(23);
        System.out.println(" name = "+student.getName());
        System.out.println(" email = "+student.getEmail());
        System.out.println(" age = "+student.getAge());
    }
}

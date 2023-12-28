import arrayprograms.Student;

public class ArrayClient {
    public static void main(String[] args) {

        Student[] a = new Student[2];

        Student s1 = new Student(105, "kanakadurga");
        Student s2 = new Student(106, "saraswathi");

        a[0] = s1;
        a[1] = s2;
        for (int i = 0; i < a.length; i++) {
            System.out.println( a[i].getId() + "  " + a[i].getName());
        }



        Student[] a1=new Student[2];
        a1[0] = s1;
        a1[1] = s2;
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i].getId() + "  " + a1[i].getName());
        }
        System.out.println("____________________________________________");


        s1.setName("durga");
        for (int i = 0; i < a.length; i++) {
            System.out.println( a[i].getId() + "  " + a[i].getName());
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i].getId() + "  " + a1[i].getName());
        }

    }
}


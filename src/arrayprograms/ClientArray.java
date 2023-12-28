package arrayprograms;

public class ClientArray {
    public static void main(String[] args) {
        Student[] a = new Student[2];

        a[0] = new Student(102, "durga");
        a[1] = new Student(103, "swathi");

        for (int i = 0; i < a.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + a[i].getName()+ " Id: "+a[i].getId());
//            System.out.println("ID: " + a[i].getId());

            System.out.println();
        }
    }
}
//

//        System.out.println("Student data in student arr 0: ");
//        a[0].display();
//
//        System.out.println("Student data in student arr 1: ");
//        a[1].display();
//    }
//}


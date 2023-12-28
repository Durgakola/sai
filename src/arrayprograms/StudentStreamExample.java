package arrayprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentStreamExample {
    static Predicate<ArrayStudent> matchedPredicate = name ->name.getName().equals("naidu");

    public static void main(String[] args) {
        List<ArrayStudent> student = new ArrayList<>();


        ArrayStudent a = new ArrayStudent("naidu", 11, 20);
        ArrayStudent a1 = new ArrayStudent("vinitha", 10, 22);
        ArrayStudent a2 = new ArrayStudent("rajesh", 11, 24);
        ArrayStudent a3 = new ArrayStudent("naidu", 10, 22);
        student.add(a);
        student.add(a1);
        student.add(a2);
        student.add(a3);

        List<ArrayStudent>streamMatchednames=student.stream().filter(matchedPredicate).collect(Collectors.toList());
        System.out.println(streamMatchednames);

    }
}
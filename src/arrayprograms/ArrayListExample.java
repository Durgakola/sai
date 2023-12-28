package arrayprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListExample {
    static Predicate<Integer> marksPredicate = (marks) -> marks > 36;

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(20);
        number.add(30);
        number.add(50);
        List<Integer> passedStudents = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            if (marksPredicate.test(number.get(i))) {
                passedStudents.add(number.get(i));
            }
        }
        System.out.println(passedStudents);
        List<Integer> strempassedStudents = number.stream().filter(num -> marksPredicate.test(num)).collect(Collectors.toList());

        System.out.println("stream passed students " + strempassedStudents);
    }
}

package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayTest {
    static Predicate<Person>matchedBranch=branch->branch.getBranch().equalsIgnoreCase("CSE");

    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        Person p=new Person("Ramu","Guntur","ECE");
        Person p1=new Person("Jonah","Nandhigama","CSE");
        Person p2=new Person("Rathna","Thenali","CSE");
        Person p3=new Person("Rachana","Guntur","ECE");

        list.add(p);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        List<Person>streamMatchedbraches=list.stream().filter(matchedBranch).collect(Collectors.toList());
        System.out.println(streamMatchedbraches);

    }
}

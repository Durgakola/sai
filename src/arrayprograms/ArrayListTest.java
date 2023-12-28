package arrayprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
//        ArrayList<String>list=new ArrayList<>();
//        list.add("rama");
//        list.add("durga");
//        list.add("sarasu");
//        System.out.println(list);

        List<Integer> List1=new ArrayList();
        List1.add(11);
        List1.add(13);
        List1.add(14);
        List1.add(15);
        List1.add(16);
        System.out.println(List1);

        for(int i=0;i<List1.size();i++){
            System.out.println(List1.get(i));
        }
        for(Integer age:List1){
            System.out.println("Advanced  "+age);
        }
    }
}

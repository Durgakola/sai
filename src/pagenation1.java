public class pagenation1 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5,6};
        int pageSize = 3;
        int lastIndex = array.length /pageSize;

        System.out.println(lastIndex);


        for (int i = 0; i < lastIndex; i++) {

            for (int j = i * pageSize; j < pageSize + (i * pageSize);  j++) {

                System.out.println("  page: " + i + " slides " + array[j]);
            }
        }
    }
}


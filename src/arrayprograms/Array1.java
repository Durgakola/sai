package arrayprograms;

public class Array1 {
    public static void main(String[] args) {
        int[] array=new int[10];
        array[0]=11;
        array[1]=12;
        array[2]=13;
        array[3]=14;
        array[4]=15;
        array[5]=20;
        array[6]=25;
        array[7]=30;
        array[8]=35;
        array[9]=40;
        for (int i = 0; i < array.length; i++)
           System.out.println("Element at index " + i + " : "+ array[i]);
            //System.out.println(array[i]);
    }
}

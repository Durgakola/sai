public class scrooling2 {
    public static void main(String[] args) {


        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,34,35,36,37,38,39,
        40,41,42,43,44,45,46,47,48,49,50};

        int pageSize = 10;
        int totalPages = (int)Math.ceil( (double)data.length / pageSize);
        for (int currentPage = 1; currentPage <= totalPages; currentPage++) {
            System.out.println("Page " + currentPage + ":");
            int start = (currentPage - 1) * pageSize;
            int end = Math.min(start + pageSize, data.length);
            for (int i = start; i < end; i++) {
                System.out.println(data[i]);
            }
            System.out.println();
        }
    }
}

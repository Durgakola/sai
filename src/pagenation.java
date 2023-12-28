public class pagenation {
    public static void main(String[] args) {
        String[] array = new String[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = "page no " + (i + 1);
        }
        int itemsPerPage = 10;
        int totalPages = (int) Math.ceil((double) array.length / itemsPerPage);
        int currentPage = 2;
        int startIndex = (currentPage - 1) * itemsPerPage;
        int endIndex = Math.min(startIndex + itemsPerPage, array.length);
        System.out.println("Page " + currentPage + " of " + totalPages + ":");
        for (int i = startIndex; i < endIndex; i++) {
            System.out.println(array[i]);
        }
    }
}



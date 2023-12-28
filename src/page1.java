public class page1 {
    private static final int PAGE_SIZE = 5;

    public static void main(String[] args) {
        // Sample array of elements
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // Calculate the total number of pages
        int totalPages = (int) Math.ceil((double) elements.length / PAGE_SIZE);

        // Simulate a user clicking on a page number
        int clickedPage = 2;

        // Display elements on the clicked page
        displayPage(elements, clickedPage);
    }

    private static void displayPage(int[] elements, int page) {
        int startIndex = (page - 1) * PAGE_SIZE;
        int endIndex = Math.min(startIndex + PAGE_SIZE, elements.length);

        System.out.println("Page " + page + ":");
        for (int i = startIndex; i < endIndex; i++) {
            System.out.println("Element " + (i + 1) + ": " + elements[i]);
        }
    }
}



import java.lang.reflect.GenericArrayType;
import java.util.Scanner;
public class pagescrooling1 {
    public static final int PAGE_SIZE = 10;
    public static final int TOTAL_PAGES = 50;

    public static void main(String[] args) {
        // Sample array of elements
        int[] elements = generateElements();

        // Simulate page navigation
        int currentPage = 50;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayPage(elements, currentPage);

            System.out.print("Enter page number (1-" + TOTAL_PAGES + "), or 0 to exit: ");
            int nextPage = scanner.nextInt();

            if (nextPage >= 1 && nextPage <= TOTAL_PAGES) {
                currentPage = nextPage;
            } else if (nextPage == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid page number. Please enter a valid page number.");
            }
        }

        scanner.close();
    }

    private static void displayPage(int[] elements, int page) {
        int startIndex = (page - 1) * PAGE_SIZE;
        int endIndex = Math.min(startIndex + PAGE_SIZE, elements.length);

        System.out.println("Page " + page + ":");
        for (int i = startIndex; i < endIndex; i++) {
            System.out.println("Element " + (i + 1) + ": " + elements[i]);
        }
        System.out.println();
    }

    private static int[] generateElements() {
        // Generate sample elements for demonstration purposes
        int[] elements = new int[TOTAL_PAGES * PAGE_SIZE];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = i + 1;
        }
        return elements;
    }
}


import java.util.ArrayList;

public class LibraryRoyalityCalculator {
    public static void main(String[] args) {
        // Create Author and add 3 different books and at least 1 audiobook.
        Author a1 = new Author("Author1");
        Title audioBook1 = new AudioBook("Audiobook1", "SKØN", 10, 400);
        Title printedBook1 = new PrintedBook("printedBook1", "BI", 30, 80);
        Title printedBook2 = new PrintedBook("printedBook2", "TE", 140, 72);
        Title printedBook3 = new PrintedBook("printedBook3", "FAG", 120, 200);
        // Adding titles to author
        a1.addTitle(audioBook1);
        a1.addTitle(printedBook1);
        a1.addTitle(printedBook2);
        a1.addTitle(printedBook3);
        // Print to see if titles are added to author correctly.
        System.out.println(a1);
        System.out.println("-----------------------------------");

        // Example 1 from the assignment. To test if printedbooks are calculated correctly.
        System.out.println("PrintedBook example:");
        System.out.println(printedBook2.calculatePoints() + " points. ");
        System.out.println(String.format("%.2f", printedBook2.calculateRoyalty()) + " kr.");
        System.out.println("-----------------------------------");

        // Audiobook example from the assignment. To test if audiobooks are calculated correctly.
        System.out.println("AudioBook example:");
        System.out.println(audioBook1.calculatePoints() + " points.");
        System.out.println(String.format("%.2f", audioBook1.calculateRoyalty()) + " kr.");
        System.out.println("-----------------------------------");

        // Displays money earned from all titles.
        System.out.println(a1.getName() + ": " + String.format("%.2f", a1.calculateTotalPay()) + " kr.");


    }
}

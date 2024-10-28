import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }
    // For adding title to author
    public void addTitle(Title title) {
        titles.add(title);
    }

    // Calculates money earned from each titel and sums - returns total.
    public float calculateTotalPay() {
        float total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    @Override // Used to display Author and their titles to see if they get added correctly.
    public String toString() {
        return "Author: " + name + ", Titles: " + titles;
    }

}

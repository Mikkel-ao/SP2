public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
        this.rate = 0.067574;
    }
    // Used for calculating "bibliotekspenge".
    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    // Both methods should remain abstract. Therefor no bodies. No parameters in assignment diagram.
    protected abstract double calculatePoints();
    protected abstract double calculateLiteraturePoints();

    @Override // Used for prints.
    public String toString() {
        return "Title: " + title + ", Type: " + literatureType + ", Copies: " + copies;
    }

    // Private literatureType so needed AudioBook and PrintedBook classes.
    public String getLiteratureType() {
        return literatureType;
    }
}

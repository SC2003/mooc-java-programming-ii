
public class Book implements Packable {

    private String authorName;
    private String bookName;
    private double bookWeight;

    public Book(String authorName, String bookName, double bookWeight) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.bookWeight = bookWeight;
    }

    @Override
    public double weight() {
        return this.bookWeight;
    }

    @Override
    public String toString() {
        return (this.authorName + ": " + this.bookName);
    }
}

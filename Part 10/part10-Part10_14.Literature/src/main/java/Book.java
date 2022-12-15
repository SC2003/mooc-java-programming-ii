
public class Book {

    private String BookName;
    private int recommendedAge;

    public Book(String BookName, int recommendedAge) {
        this.BookName = BookName;
        this.recommendedAge = recommendedAge;
    }

    public String getBookName() {
        return BookName;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public void setRecommendedAge(int recommendedAge) {
        this.recommendedAge = recommendedAge;
    }

    @Override
    public String toString() {
        return (this.BookName + " (recommended for " + this.recommendedAge + " year-olds or older)");
    }

}

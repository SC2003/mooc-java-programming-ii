
public class CD implements Packable {

    private String artistName;
    private String cdName;
    private int cdPublicationYear;
    private double cdWeight;

    public CD(String artistName, String cdName, int cdPublicationYear) {
        this.artistName = artistName;
        this.cdName = cdName;
        this.cdPublicationYear = cdPublicationYear;
        this.cdWeight = 0.1; //kg
    }

    @Override
    public double weight() {
        return this.cdWeight;
    }

    @Override
    public String toString() {
        return (this.artistName + ": " + this.cdName + " (" + this.cdPublicationYear + ")");
    }
}

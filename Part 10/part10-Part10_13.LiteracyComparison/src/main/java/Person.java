public class Person implements Comparable<Person>{
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;

    public Person(String gender, String country, int year, double literacyPercent) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }
    
    @Override
    public String toString() {
        return this.country+" ("+this.year+"), "+this.gender+", "+this.literacyPercent; 
    }

    
    
    @Override
    public int compareTo(Person o) {
        int lit = (int) (this.literacyPercent * 100000);
        int litP = (int) (o.getLiteracyPercent()*100000);
        
        return lit - litP;
    }
     
    
    
}
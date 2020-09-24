package AssignmentTwo;

public class Address {

    //  Variables
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;
    private int zipCode;

    //  Constructor Method
    public Address(int streetNumber, String streetName, String city, String state, int zipCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //  Returns Address variables as String
    public String toString() {
        return String.format("%s, %s, %s, %s %s", streetNumber, streetName, city, state, zipCode);
    }
}

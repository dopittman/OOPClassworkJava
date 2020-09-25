package AssignmentTwo;

public class Person {

    // Variables
    private int bannerId;
    private String eyeColor;
    private Address homeAddress;
    private Address workAddress;

    //  Getters
    public int getBannerId() {
        return bannerId;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress(){
        return workAddress;
    }

    // Returns all variables as a String
    public String toString() {
        return String.format("BannerID: %s \nEye Color: %s \nHome Address: %s \nWork Address: %s", bannerId, eyeColor, homeAddress, workAddress);
    }

    // Constructor Method
    public Person(int bannerId, String eyeColor, Address homeAddress, Address workAddress) {
        this.bannerId = bannerId;
        this.eyeColor = eyeColor;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }
}

package AssignmentTwo;


public class Instructor {

    //  Variables
    private String title;
    private String firstName;
    private String lastName;
    private String designation;
    private String course;
    private String institution;

    //  Getters
    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public String course() {
        return course;
    }

    public String getInstitution() {
        return institution;
    }


    //  Setters
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setDesignation(String newDesignation) {
        this.designation = newDesignation;
    }

    public void setCourse(String newCourse) {
        this.course = newCourse;
    }

    public void setInstitution(String newInstitution) {
        this.institution = newInstitution;
    }

    // Write string with all content
    public String toString() {
        return String.format("%s %s %s is an %s at %s and, he teaches %s", title, firstName, lastName, designation, institution, course);
    }

    //  Constructor
    public Instructor(String title, String firstName, String lastName, String designation, String course, String institution) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.course = course;
        this.institution = institution;
    }
}

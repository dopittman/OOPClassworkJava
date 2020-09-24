package AssignmentTwo;



public class Main {

    public static void main(String[] args) {
	// write your code here

        Instructor Instructor1 = new Instructor("Dr.", "Prashanth", "Busi Reddy Gari", "Instructor", "Java Proramming", "UNCP");

        System.out.println(Instructor1.toString());
        Instructor1.setCourse("Web Programming");
        System.out.println(Instructor1.toString());
        Instructor1.setDesignation("Assistant Professor");
        System.out.println(Instructor1.toString());
        Instructor1.setInstitution("University of North Carolina - Pembroke");
        System.out.println(Instructor1.toString());
    }
}

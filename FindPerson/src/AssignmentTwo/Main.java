package AssignmentTwo;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Dr.", "Prashanth","Busi Redi Gary", "UNCP","Java Programming", "UNCP");
        Address homeAddress = new Address(123, "Monroe St", "Fayetteville,","NC", 28301);
        Address workAddress = new Address(1219, "Oxendine Building,", "Pembroke,","NC", 28372);
        Person person1 = new Person(123456789, "Black", homeAddress, workAddress);

        System.out.println(String.format("%s %s %s's home address is %s", instructor1.getTitle(), instructor1.getFirstName(), instructor1.getLastName(), homeAddress));
        System.out.println(String.format("%s %s %s's work address is %s", instructor1.getTitle(), instructor1.getFirstName(), instructor1.getLastName(), workAddress));

        System.out.println();
        System.out.println("More Information:");
        System.out.println(person1.toString());
    }
}

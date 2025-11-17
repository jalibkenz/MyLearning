package Day_2025_11_17;


import java.util.Optional;

class Person {
    private Optional<String> name;
    private Optional<String> mobile;

    // Constructor
    public Person(String name, String mobile) {
        this.name = Optional.ofNullable(name);
        this.mobile = Optional.ofNullable(mobile);
    }

    public Optional<String> getName() {
        return name;
    }

    public Optional<String> getMobile() {
        return mobile;
    }
}

public class OptionalClassMainClass {
    public static void main(String[] args) {

        // Creating Person objects
        Person p1 = new Person("Alice", "9876543210");
        Person p2 = new Person(null, null);   // missing data

        printPersonDetails(p1);
        printPersonDetails(p2);
    }

    // Method to print using Optional
    private static void printPersonDetails(Person person) {

        String name = person.getName().orElse("No Name Provided");
        String mobile = person.getMobile().orElse("No Mobile Provided");

        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("-------------------------");
    }
}


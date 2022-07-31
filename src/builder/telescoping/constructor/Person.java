package builder.telescoping.constructor;

/**
 * Another example of Telescoping Constructors with default values.
 */
public class Person {

    private final String firstName;
    private final String lastName;
    private final String description;
    private final int age;

    public Person(String firstName, String lastName) {
        this(firstName, lastName, "No description available");
    }

    public Person(String firstName, String lastName, String description) {
        this(firstName, lastName, description, -1);
    }

    public Person(String firstName, String lastName, String description, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.age = age;
    }
}

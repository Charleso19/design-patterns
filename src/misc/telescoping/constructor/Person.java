package misc.telescoping.constructor;

/**
 * Example of Telescoping Constructors.
 *
 * https://www.vojtechruzicka.com/avoid-telescoping-constructor-pattern/#:~:text=As%20a%20workaround%2C%20a%20technique,values%20for%20the%20extra%20parameters.
 *
 * In Java, there is no support for default values for constructor parameters. As a workaround, a technique called "Telescoping constructor" is often used.
 * A class has multiple constructors, where each constructor calls a more specific constructor in the hierarchy, which has more parameters than itself,
 * providing default values for the extra parameters. The next constructor does the same until there is no left.
 *
 * What's wrong with it?
 * As long as there are only several attributes, everything seems to be ok. But as their number rises, problems start to begin. Such constructors are hard to read.
 * They have many parameters - who know what the sixth one is? If the adjacent parameters have the same type, you can accidentally switch their values without
 * compilation error and everything seems to be fine. Furthermore, you rarely know which optional parameters consumer wants to use for his scenario, which often
 * results in constructor calls where the constructor has many parameters, but many of them are null. It is hard to read which variant of the object is being
 * constructed without further investigation. When adding new parameters, you have to add new constructors to the chain.
 * This pattern can therefore not scale very well - it is hard to maintain and from a certain number of parameters, constructors are insanely long and there is
 * just too many of them.
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

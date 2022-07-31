package builder.telescoping.constructor;

/**
 * Example of Telescoping Constructors.
 *
 * Telescoping constructor style below is immutable, but it gets quite complicated trying to think of all the different scenarios for construction. Can also be
 * difficult if you only want a couple of parameters, for example, bread and meat. You'd have to use
 * the 4 parameter constructor and enter null values, which is a bit cumbersome and confusing, or create yet another constructor for each variation,
 * like bread and condiments, for example, which can eventually pollute the class with lots of constructors.
 *
 * JavaBean convention is a lot more readable and easily configurable due to setters, but is also mutable!
 */
public class LunchOrderTele {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderTele(String bread) {
        this.bread = bread;
    }

    public LunchOrderTele(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }
    public LunchOrderTele(String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderTele(String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}

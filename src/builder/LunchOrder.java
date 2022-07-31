package builder;

/**
 * The Builder pattern offers the configurability of the JavaBean convention, AND it is immutable.
 */
public class LunchOrder {

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(final LunchOrderBuilder lunchOrderBuilder) {
        this.bread = lunchOrderBuilder.bread;
        this.condiments = lunchOrderBuilder.condiments;
        this.dressing = lunchOrderBuilder.dressing;
        this.meat = lunchOrderBuilder.meat;

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

    public static class LunchOrderBuilder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public LunchOrderBuilder() {

        }

        public LunchOrder build() {
            // We can also cater for default values, much like Telescoping constructors.
            if (LunchOrderBuilder.this.condiments == null || LunchOrderBuilder.this.condiments.isEmpty()) {
                LunchOrderBuilder.this.condiments = "Sandwich Spread";
            }
            return new LunchOrder(LunchOrderBuilder.this);
        }

        public LunchOrderBuilder bread(final String bread) {
            LunchOrderBuilder.this.bread = bread;
            return this;
        }

        public LunchOrderBuilder condiments(final String condiments) {
            LunchOrderBuilder.this.condiments = condiments;
            return this;
        }

        public LunchOrderBuilder dressing(final String dressing) {
            LunchOrderBuilder.this.dressing = dressing;
            return this;
        }

        public LunchOrderBuilder meat(final String meat) {
            LunchOrderBuilder.this.meat = meat;
            return this;
        }
    }
}

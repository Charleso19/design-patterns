package builder;

import builder.telescoping.constructor.LunchOrderBean;
import builder.telescoping.constructor.LunchOrderTele;

public class BuilderMain {

    public static void main(String[] args) {

        final LunchOrder lunchOrder = new LunchOrder.LunchOrderBuilder()
                .bread("Brown")
                .meat("Ham")
                .dressing("Mayo")
                .build();

        /*
         * Prints:
         * Brown
         * Ham
         * Mayo
         * Sandwich Spread
         *
         * We cannot change any of the variables as are there are no setters -  we have to create a new LunchOrder via LunchOrderBuilder if we wish to do that.
         */
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getMeat());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getCondiments());

        // The JavaBean alternative is simpler but the instance is not mutable.
        final LunchOrderBean lunchOrderBean = new LunchOrderBean()
                .setBread("Brown")
                .setCondiments("Sandwich Spread")
                .setDressing("Mayo")
                .setMeat("Turkey");
        System.out.println(lunchOrder.getBread()); // Prints Brown
        lunchOrderBean.setBread("White");
        System.out.println(lunchOrder.getBread()); // Prints White

        // Telescoping constructors are mutable, but can be difficult to implement edge-case construction without creating one for each variant.
        final LunchOrderTele lunchOrderTele = new LunchOrderTele("White", null, null, "Ham");
    }
}

package headfirstdesgin.chapter3;

/**
 * @author: Santosh RNB
 * @created: 5/18/24
 */
public class main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescritpion());
        System.out.println(espresso.cost());

        Beverage esspressoWithAddons = new Espresso();
        esspressoWithAddons = new Mocha(esspressoWithAddons);
        esspressoWithAddons = new WhipMilk(esspressoWithAddons);
        System.out.println(esspressoWithAddons.getDescritpion());
        System.out.println(esspressoWithAddons.cost());
    }
}

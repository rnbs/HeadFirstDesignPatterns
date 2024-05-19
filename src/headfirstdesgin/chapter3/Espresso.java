package headfirstdesgin.chapter3;

/**
 * @author: Santosh RNB
 * @created: 5/18/24
 */
public class Espresso extends Beverage {

    Espresso() {
        descritpion = "Espresso";
    }

    @Override
    public double cost() {
        return 1.19;
    }
}

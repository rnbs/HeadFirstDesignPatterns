package headfirstdesgin.chapter3;

/**
 * @author: Santosh RNB
 * @created: 5/18/24
 */
public abstract class Beverage {
    String descritpion;

    public String getDescritpion() {
        return this.descritpion;
    }

    public abstract double cost();
}

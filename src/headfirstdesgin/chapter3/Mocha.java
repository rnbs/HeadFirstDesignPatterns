package headfirstdesgin.chapter3;

/**
 * @author: Santosh RNB
 * @created: 5/18/24
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;
    double cost;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.descritpion = beverage.descritpion + ", Mocha";
        this.cost = 0.2;
    }

    @Override
    public String getDescription() {
        return this.descritpion;
    }

    public double cost() {
        return beverage.cost() + this.cost;
    }

}

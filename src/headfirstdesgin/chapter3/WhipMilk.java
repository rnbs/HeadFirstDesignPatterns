package headfirstdesgin.chapter3;

/**
 * @author: Santosh RNB
 * @created: 5/18/24
 */
public class WhipMilk extends CondimentDecorator {
    Beverage beverage;
    double cost;

    WhipMilk(Beverage beverage) {
        this.beverage = beverage;
        this.descritpion = beverage.descritpion + ", WhipMilk";
        this.cost = .4;
    }

    public double cost() {
        return beverage.cost() + this.cost;
    }

    @Override
    public String getDescription() {
        return this.descritpion;
    }
}

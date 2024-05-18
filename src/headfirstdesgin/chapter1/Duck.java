package headfirstdesgin.chapter1;

/**
 * @author: Santosh RNB
 * @created: 5/17/24
 */
public class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public void swim() {
        System.out.println("This Duck swims in the pond");
    }

    public void display() {
        this.swim();
        this.flyBehaviour.fly();
        this.quackBehaviour.quack();
    }
}

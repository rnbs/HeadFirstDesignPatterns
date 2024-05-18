package headfirstdesgin.chapter1;

/**
 * @author: Santosh RNB
 * @created: 5/17/24
 */
public class NoFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("This is the no fly behaviour");
    }
}

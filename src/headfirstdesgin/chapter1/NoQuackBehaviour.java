package headfirstdesgin.chapter1;

/**
 * @author: Santosh RNB
 * @created: 5/17/24
 */
public class NoQuackBehaviour implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("This is the noQuack behaviour");
    }
}

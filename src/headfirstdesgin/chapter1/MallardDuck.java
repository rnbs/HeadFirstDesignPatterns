package headfirstdesgin.chapter1;

/**
 * @author: Santosh RNB
 * @created: 5/17/24
 */
public class MallardDuck extends Duck {
    MallardDuck(){
        this.quackBehaviour = new NoQuackBehaviour();
        this.flyBehaviour = new FlyWithWings();
    }

    public void showDuckName() {
        System.out.println("This is Mallard Duck");
    }
}

package wzh.easy_fac;

/**
 * @author wzh
 * @date 2023年10月02日 15:44
 * Description:
 */
public class SimplePizzaFactory {
    Pizza pizza = null;

    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) pizza = new CheesePizza();
        else if ("pepper".equals(type)) pizza = new PepperPizza();
        else if ("greek".equals(type)) pizza = new GreekPizza();
        return pizza;
    }
}

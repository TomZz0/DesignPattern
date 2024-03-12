package wzh.easy_fac;

/**
 * @author wzh
 * @date 2023年10月02日 15:47
 * Description:
 */
public class OrderPizza {
    private SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

    public CheesePizza orderCheesePizza() {
        return (CheesePizza) simplePizzaFactory.createPizza("cheese");
    }
    public PepperPizza orderPepperPizza() {
        return (PepperPizza) simplePizzaFactory.createPizza("pepper");
    }
    public GreekPizza orderGreekPizza() {
        return (GreekPizza) simplePizzaFactory.createPizza("greek");
    }
}

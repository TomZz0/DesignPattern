package wzh.easy_fac;

/**
 * @author wzh
 * @date 2023年10月02日 15:46
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        CheesePizza cheesePizza = orderPizza.orderCheesePizza();
        cheesePizza.prepare();
    }
}

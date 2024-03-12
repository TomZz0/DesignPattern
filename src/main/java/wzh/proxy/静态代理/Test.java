package wzh.proxy.静态代理;

/**
 * @author wzh
 * @date 2023年10月07日 21:07
 * Description:
 */
public class Test {
    public static void main(String[] args) {

        IRentHouse iRentHouse = new RentHouse();

        IntermediaryProxy intermediaryProxy = new IntermediaryProxy(iRentHouse);
        intermediaryProxy.tentHouse();
    }
}

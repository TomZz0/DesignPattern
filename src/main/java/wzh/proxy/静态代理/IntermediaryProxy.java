package wzh.proxy.静态代理;

/**
 * @author wzh
 * @date 2023年10月07日 21:06
 * Description: proxy : offer more service based on original class
 */
public class IntermediaryProxy implements IRentHouse {
    private IRentHouse iRentHouse;

    public IntermediaryProxy(IRentHouse iRentHouse) {
        this.iRentHouse = iRentHouse;
    }

    @Override
    public void tentHouse() {
        System.out.println("代理的增强服务：中介收费");
        iRentHouse.tentHouse();
        System.out.println("代理的增强服务：中介提供物业折扣");
    }
}

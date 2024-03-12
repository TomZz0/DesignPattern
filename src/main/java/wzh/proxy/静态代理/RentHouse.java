package wzh.proxy.静态代理;

/**
 * @author wzh
 * @date 2023年10月07日 21:04
 * Description:
 */
public class RentHouse implements IRentHouse {

    @Override
    public void tentHouse() {
        System.out.println("租个房子");
    }
}

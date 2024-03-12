package wzh.observer;

/**
 * @author wzh
 * @date 2023年10月06日 15:49
 * Description:
 */
public class WeixinUser implements Observer {
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + '-' + msg);
    }
}

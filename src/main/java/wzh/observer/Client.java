package wzh.observer;

/**
 * @author wzh
 * @date 2023年10月06日 15:57
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        WeixinUser u1 = new WeixinUser("李世民");
        WeixinUser u2 = new WeixinUser("王一生");
        WeixinUser u3 = new WeixinUser("辛弃疾");

        subscriptionSubject.attach(u1);
        subscriptionSubject.attach(u2);
        subscriptionSubject.attach(u3);

        subscriptionSubject.notify("小凡别跑：再世西游103集更新");
    }
}

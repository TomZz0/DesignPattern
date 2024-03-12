package wzh.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wzh
 * @date 2023年10月06日 15:55
 * Description: concrete subject
 */
public class SubscriptionSubject implements Subject{
    //存储订阅用户
    private List<Observer> weixinUsers = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        weixinUsers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUsers.remove(observer);
    }

    @Override
    public void notify(String msg) {
        for (Observer o :weixinUsers) {
            o.update(msg);
        }

    }
}

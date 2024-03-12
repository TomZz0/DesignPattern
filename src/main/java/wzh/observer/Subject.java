package wzh.observer;

/**
 * 抽象被观察者
 */
public interface Subject {

    /**
     * 增加订阅者
     * @param observer
     */
     void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 发布信息
     * @param observer
     */
    void notify(String msg);
}

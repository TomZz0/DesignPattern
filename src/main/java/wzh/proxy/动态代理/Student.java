package wzh.proxy.动态代理;

/**
 * @author wzh
 * @date 2024年03月11日 22:15
 * Description:
 */
public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try {
            System.out.println(name + "数钱中，准备上交班费");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + "上交班费50元");
    }
}

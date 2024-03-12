package wzh.proxy.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author wzh
 * @date 2024年03月11日 22:23
 * Description:
 */
public class ProxyTest {
    public static void main(String[] args) {
        Person zhangsan = new Student("张三");

        //创建与代理类向关联的InvocationHandler
        InvocationHandler stuHandler =
                new StuInvocationHandler<Person>(zhangsan);

        //创建代理对象代理zhangsan 代理对象执行的是handler的invoke方法
        Person stuProxy = (Person)Proxy.newProxyInstance
                (Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);

        //执行
        stuProxy.giveMoney();
    }
}

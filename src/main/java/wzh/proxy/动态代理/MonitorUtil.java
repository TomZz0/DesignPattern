package wzh.proxy.动态代理;

/**
 * @author wzh
 * @date 2024年03月11日 22:17
 * Description:计时器
 */
public class MonitorUtil {
    private static ThreadLocal<Long> t1 = new ThreadLocal<>();

    public static void start() {
        t1.set(System.currentTimeMillis());
    }

    public static void finish(String methodName) {
        Long l = t1.get();
        System.out.println(methodName+"方法执行用时" + (System.currentTimeMillis() - l));
    }
}

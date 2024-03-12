package wzh.Singleton.hungry;

/**
 * @author wzh
 * @date 2023年10月04日 15:34
 * Description:
 */
public class Hungry {
    private static final Hungry hungry =  new Hungry();

    public Hungry() {
    }
    public static Hungry getInstance(){
        return hungry;
    }
}

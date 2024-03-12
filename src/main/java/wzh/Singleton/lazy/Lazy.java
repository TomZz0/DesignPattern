package wzh.Singleton.lazy;

import java.io.Serializable;

/**
 * @author wzh
 * @date 2023年10月04日 15:29
 * Description:
 */
public class Lazy implements Serializable {
    private static volatile Lazy lazy;

    public Lazy() {
    }
    public static  Lazy getInstance(){
        if (lazy == null){
            synchronized (Lazy.class){
                if (lazy == null){
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }
}

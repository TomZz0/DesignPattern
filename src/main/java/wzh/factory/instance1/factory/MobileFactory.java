package wzh.factory.instance1.factory;

import wzh.factory.instance1.product.HuaweiMobile;

/**
 * @author wzh
 * @date 2023年10月02日 16:17
 * Description:
 */
public abstract class MobileFactory {
    public abstract <T extends HuaweiMobile> T createHuaweiMobile(Class<T> t);
}

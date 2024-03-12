package wzh.factory.instance1.factory;

import wzh.factory.instance1.product.HuaweiHonor;
import wzh.factory.instance1.product.HuaweiMobile;

/**
 * @author wzh
 * @date 2023年10月02日 16:29
 * Description:
 */
public class HuaweiHonorFactory implements HuaweiFactory {
    @Override
    public HuaweiMobile createHuaweiMobile() {
        return new HuaweiHonor();
    }
}

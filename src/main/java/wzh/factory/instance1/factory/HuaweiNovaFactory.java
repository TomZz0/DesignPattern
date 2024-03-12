package wzh.factory.instance1.factory;

import wzh.factory.instance1.product.HuaweiMobile;
import wzh.factory.instance1.product.HuaweiNova;

/**
 * @author wzh
 * @date 2023年10月02日 16:29
 * Description:
 */
public class HuaweiNovaFactory implements HuaweiFactory {
    @Override
    public HuaweiMobile createHuaweiMobile() {
        return new HuaweiNova();
    }
}

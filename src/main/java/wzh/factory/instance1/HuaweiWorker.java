package wzh.factory.instance1;

import wzh.factory.instance1.factory.HuaweiMobileFactory;
import wzh.factory.instance1.factory.HuaweiNovaFactory;
import wzh.factory.instance1.factory.MobileFactory;
import wzh.factory.instance1.product.HuaweiHonor;
import wzh.factory.instance1.product.HuaweiMate;
import wzh.factory.instance1.product.HuaweiNova;

/**
 * @author wzh
 * @date 2023年10月02日 16:24
 * Description:
 */
public class HuaweiWorker {
    public static void main(String[] args) {
        MobileFactory mobileFactory = new HuaweiMobileFactory();
        HuaweiMate mate = mobileFactory.createHuaweiMobile(HuaweiMate.class);
        mate.mobileSeries();
        HuaweiHonor honor = mobileFactory.createHuaweiMobile(HuaweiHonor.class);
        honor.mobileSeries();
        HuaweiNovaFactory huaweiNovaFactory = new HuaweiNovaFactory();
        HuaweiNova nova = (HuaweiNova) huaweiNovaFactory.createHuaweiMobile();
        nova.mobileSeries();
    }
}

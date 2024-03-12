package wzh.factory.instance1.factory;

import wzh.factory.instance1.product.HuaweiMobile;

/**
 * @author wzh
 * @date 2023年10月02日 16:19
 * Description:
 */
public class HuaweiMobileFactory extends MobileFactory{
    @Override
    public <T extends HuaweiMobile> T createHuaweiMobile(Class<T> t) {
        HuaweiMobile huaweiMobile = null;
        try {
            huaweiMobile = (HuaweiMobile) Class.forName(t.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("手机生产失败");
        }
        return (T)huaweiMobile;
    }
}

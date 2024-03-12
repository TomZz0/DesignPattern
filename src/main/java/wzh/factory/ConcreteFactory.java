package wzh.factory;

/**
 * @author wzh
 * @date 2023年10月02日 16:09
 * Description:
 */
public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> t) {
        Product product = null;
        try {
            product = (Product) Class.forName(t.getName()).newInstance();
        } catch (Exception e) {
            throw new RuntimeException("产品创建失败");
        }
        return (T) product;
    }
}

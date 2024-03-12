package wzh.factory;

/**
 * @author wzh
 * @date 2023年10月02日 16:08
 * Description: abstract factory
 */
public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> t);
}

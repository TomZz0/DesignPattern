package wzh.strategy;

/**
 * @author wzh
 * @date 2023年10月05日 16:43
 * Description:
 */
public class IntermediateMemberStrategy implements MemberStrategy{
    @Override
    public double calPrice(double price, int n) {
        return price * 0.9 * n;
    }
}

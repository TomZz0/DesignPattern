package wzh.strategy;

/**
 * @author wzh
 * @date 2023年10月05日 16:44
 * Description:
 */
public class MemberContext {
    private MemberStrategy memberStrategy;

    public MemberContext(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }
    public double quotePrice(double price,int n){
        return memberStrategy.calPrice(price,n);
    }
}

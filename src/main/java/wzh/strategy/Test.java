package wzh.strategy;

/**
 * @author wzh
 * @date 2023年10月05日 16:45
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        MemberContext memberContext = new MemberContext(new IntermediateMemberStrategy());
        double v = memberContext.quotePrice(50.6, 3);
        System.out.println(v);
    }
}

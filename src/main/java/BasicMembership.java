
public class BasicMembership extends Membership {

    private int newBonusPointsBalance;
    private final static String membershipName = "BASIC";

    public BasicMembership(int bonusPointBalance) {
        super(bonusPointBalance);
    }

    @Override
    public int RegisterPoints(int bonusPointBalance, int newPoints) {
        newBonusPointsBalance = bonusPointBalance + newPoints;
        return newBonusPointsBalance;
    }

    @Override
    public String getMembershipName() {
        return membershipName;
    }
}

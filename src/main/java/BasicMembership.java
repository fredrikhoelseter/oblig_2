
public class BasicMembership extends Membership {

    private int newBonusPointsBalance;
    private final static String membershipName = "BASIC";

    public BasicMembership(int bonusPointBalance, int newPoints) {
        super(bonusPointBalance, newPoints);
    }

    @Override
    public int RegisterPoints(int bonusPointBalance, int newPoints) {
        newBonusPointsBalance = super.getBonusPointBalance() + super.getNewPoints();
        return newBonusPointsBalance;
    }

    @Override
    public String getMembershipName() {
        return membershipName;
    }
}

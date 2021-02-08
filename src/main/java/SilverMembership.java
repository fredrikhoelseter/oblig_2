
public class SilverMembership extends Membership {

    private int newBonusPointsBalance;
    private final static String membershipName = "SILVER";
    private final static float POINTS_SCALING_FACTOR = 1.2f;

    public SilverMembership(int bonusPointBalance) {
        super(bonusPointBalance);
    }

    @Override
    public int RegisterPoints(int bonusPointBalance, int newPoints) {
        newBonusPointsBalance = super.getBonusPointBalance() + Math.round(super.getNewPoints() * POINTS_SCALING_FACTOR);
        return newBonusPointsBalance;
    }

    @Override
    public String getMembershipName() {
        return membershipName;
    }
}


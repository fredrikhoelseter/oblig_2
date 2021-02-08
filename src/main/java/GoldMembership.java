
public class GoldMembership extends Membership {

    private int newBonusPointsBalance;
    private final static String membershipName = "GOLD";
    private final static float POINTS_SCALING_FACTOR_1 = 1.3f;
    private final static float POINTS_SCALING_FACTOR_2 = 1.5f;

    public GoldMembership(int bonusPointBalance) {
        super(bonusPointBalance);
    }

    @Override
    public int RegisterPoints(int bonusPointBalance, int newPoints) {
        if (bonusPointBalance < 90000) {
            newBonusPointsBalance = super.getBonusPointBalance() + Math.round(super.getNewPoints() * POINTS_SCALING_FACTOR_1);
        }
        else {
            newBonusPointsBalance = super.getBonusPointBalance() + Math.round(super.getNewPoints() * POINTS_SCALING_FACTOR_2);
        }

        return newBonusPointsBalance;
    }

    @Override
    public String getMembershipName() {
        return membershipName;
    }
}
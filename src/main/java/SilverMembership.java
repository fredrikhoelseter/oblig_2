
/**
 * This class extends the membership class and defines the membership
 * as silver-membership
 *
 * @author fredrik
 */
public class SilverMembership extends Membership {

    private int newBonusPointsBalance;
    private final static String membershipName = "SILVER";
    private final static float POINTS_SCALING_FACTOR = 1.2f;

    @Override
    public int RegisterPoints(int bonusPointBalance, int newPoints) {
        newBonusPointsBalance = bonusPointBalance + Math.round(newPoints * POINTS_SCALING_FACTOR);
        return newBonusPointsBalance;
    }

    @Override
    public String getMembershipName() {
        return membershipName;
    }
}


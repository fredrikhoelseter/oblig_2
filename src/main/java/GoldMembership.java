/**
 * This class extends the membership class and defines the membership
 * as gold-membership
 *
 * @author fredrik
 */
public class GoldMembership extends Membership {

    private int newBonusPointsBalance;
    private final static String membershipName = "GOLD";
    private final static float POINTS_SCALING_FACTOR_1 = 1.3f;
    private final static float POINTS_SCALING_FACTOR_2 = 1.5f;


    @Override
    public int RegisterPoints(int bonusPointBalance, int newPoints) {
        if (bonusPointBalance < 90000) {
            newBonusPointsBalance = bonusPointBalance + Math.round(newPoints * POINTS_SCALING_FACTOR_1);
        }
        else {
            newBonusPointsBalance = bonusPointBalance + Math.round(newPoints * POINTS_SCALING_FACTOR_2);
        }

        return newBonusPointsBalance;
    }

    @Override
    public String getMembershipName() {
        return membershipName;
    }
}
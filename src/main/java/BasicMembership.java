/**
 * This class extends the membership class and defines the membership
 * as basic-membership
 *
 * @author fredrik
 */
public class BasicMembership extends Membership {

    private int newBonusPointsBalance;
    private final static String membershipName = "BASIC";


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

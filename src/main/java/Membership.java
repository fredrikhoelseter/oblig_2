/**
 * Creates a default membership and is the superclass of BasicMembership,
 * SilverMembership, GoldMembership.
 *
 * @author fredrik
 */
public abstract class Membership {

    private int newBonusPointBalance;
    private String membershipName;
    private int bonusPointBalance;
    private int newPoints;

    /**
     * Returns the new bonuspoint balance
     * @param bonusPointBalance The current bonuspointbalance
     * @param newPoints The bonus points to be added
     * @return Returns the new bonus point balance as an integer
     */
    public abstract int RegisterPoints(int bonusPointBalance, int newPoints);

    /**
     * Returns the membership name
     * @return Returns the membership name as a string
     */
    public abstract String getMembershipName();

    /**
     * Returns the bonuspoint balance
     * @return Returns the bonuspoint balance as an integer
     */
    public int getBonusPointBalance() {
        return bonusPointBalance;
    }

    /**
     * Returns the new points
     * @return Returns the new points as an integer
     */
    public int getNewPoints() {
        return newPoints;
    }
}

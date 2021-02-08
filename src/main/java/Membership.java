
public class Membership {

    private int newBonusPointBalance;
    private String membershipName;
    private int bonusPointBalance;
    private int newPoints;


    public Membership (int bonusPointBalance, int newPoints) {
        this.bonusPointBalance = bonusPointBalance;
        this.newPoints = newPoints;
    }

    public int RegisterPoints(int bonusPointBalance, int newPoints) {
        return newBonusPointBalance;
    }

    public String getMembershipName() {
        return membershipName;
    }

    public int getBonusPointBalance() {
        return bonusPointBalance;
    }

    public int getNewPoints() {
        return newPoints;
    }
}

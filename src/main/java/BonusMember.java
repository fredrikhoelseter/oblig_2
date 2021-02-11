import java.time.LocalDate;

/**
 * The bonus member class holds information on a single bonus member.
 * Provides functionality such as changing bonus points for the member,
 * checking passwords, and checking and setting membership levels.
 *
 * @author fredrik
 */
public class BonusMember {

    //fields
    private int memberNumber;
    private LocalDate enrolledDate;
    private int bonusPointBalance = 0;
    private int newPoints = 0;
    private String name;
    private String eMailAddress;
    private String password;
    private Membership membership;
    private String membershipName;

    //constants
    private static final int SILVER_LIMIT = 25000;
    private static final int GOLD_LIMIT = 75000;

    /**
     * initializes the bonus member class,
     * also sets the membership level of the member
     * @param memberNumber The ID used to recognise members
     * @param enrolledDate The date the member was registered in the system
     * @param bonusPoints The bonus points the member currently has.
     * @param name The name of the member
     * @param eMailAddress The email address of the member
     */
    public BonusMember(int memberNumber, LocalDate enrolledDate, int bonusPoints,
                       String name, String eMailAddress) {

        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.bonusPointBalance = bonusPoints;
        this.name = name;
        this.eMailAddress = eMailAddress;

        checkAndSetMembership();
    }

    public void checkAndSetMembership() {
        if (bonusPointBalance < SILVER_LIMIT) {
            membership = new BasicMembership();
        }
        if (bonusPointBalance >= SILVER_LIMIT && bonusPointBalance < GOLD_LIMIT) {
            membership = new SilverMembership();
        }
        if (bonusPointBalance >= GOLD_LIMIT) {
            membership = new GoldMembership();
        }
        membershipName = membership.getMembershipName();
    }

    /**
     * Checks if the parameter password equals the password registered on the member
     * @param password
     * @return Returns true or false, depending on whether the inputted password matches the member´s password
     */
    public boolean checkPassword(String password) {
        boolean isPasswordCorrect = false;
        if (this.password.equals(password)) {
            isPasswordCorrect = true;
        }
        return isPasswordCorrect;
    }

    /**
     * Adds points to the bonus point balance. (points adjusted based on membership level)
     * @param newPoints The points to be added
     */
    public void registerBonusPoints(int newPoints) {
        this.newPoints = newPoints;
        this.bonusPointBalance = membership.RegisterPoints(bonusPointBalance, newPoints);
        checkAndSetMembership();
    }

    /**
     * Returns the member number as an integer.
     * @return Returns the member number as an integer.
     */
    public int getMemberNumber() {
        return memberNumber;
    }

    /**
     * Returns the enrolled date a string.
     * @return Returns the enrolled date as a string.
     */
    public LocalDate getEnrolledDate() {
        return enrolledDate;
    }

    /**
     * Returns the bonus point balance as an integer.
     * @return Returns the bonus point balance as an integer.
     */
    public int getBonusPointBalance() {
        return bonusPointBalance;
    }

    /**
     * Returns the name of the member as a string.
     * @return Returns the name of the member as a string.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the email of the member as a string.
     * @return Returns the email of the member as a string.
     */
    public String getMailAddress() {
        return eMailAddress;
    }

    /**
     * Returns the password of the member as a string.
     * @return Returns the password of the member as a string.
     */
    public String getPassword() {
        return password;
    }

    public String getMembershipName() {
        return membershipName;
    }
}

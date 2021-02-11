import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MembershipTest {

    @Nested
    @DisplayName("Basic-membership tests")
    public class testBasicMembership {
        private int bonusPoints = 1000;
        private Membership membership = new BasicMembership();

        @Test
        @DisplayName("Bonus points added correctly test")
        public void bonusPointsAddedCorrectly () {
            assertTrue(membership.RegisterPoints(bonusPoints,1000) == 2000);
        }

        @Test
        @DisplayName("Membershipname is correct test")
        public void membershipNameIsCorrect() {
            assertEquals(membership.getMembershipName(), "BASIC");
        }
    }

    @Nested
    @DisplayName("Silver-membership tests")
    public class testSilverMembership {
        private int bonusPoints = 30000;
        private Membership membership = new SilverMembership();

        @Test
        @DisplayName("Bonus points added correctly test")
        public void bonusPointsAddedCorrectly() {
            assertTrue(membership.RegisterPoints(bonusPoints, 10000) == 42000);
        }

        @Test
        @DisplayName("Membershipname is correct test")
        public void membershipNameIsCorrect() {
            assertEquals(membership.getMembershipName(), "SILVER");
        }
    }

    @Nested
    @DisplayName("Gold-membership tests")
    public class testGoldMembership {
        private int bonusPoints = 80000;
        private Membership membership = new GoldMembership();

        @Test
        @DisplayName("Bonus points added correctly while under 90 000 bonus points test")
        public void bonusPointsAddedCorrectlyWhileUnderNinetyThousand() {
            assertTrue(membership.RegisterPoints(bonusPoints, 10000) == 93000);
        }

        @Test
        @DisplayName("Bonus points added correctly while over 90 000 bonus points test")
        public void bonusPointsAddedCorrectlyWhileOverNinetyThousand() {
            assertTrue(membership.RegisterPoints(bonusPoints + 10000, 10000) == 105000);
        }

        @Test
        @DisplayName("Membershipname is correct test")
        public void membershipNameIsCorrect() {
            assertEquals(membership.getMembershipName(), "GOLD");
        }
    }


}

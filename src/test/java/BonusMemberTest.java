import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BonusMemberTest {
    private BonusMember bonusMember = new BonusMember(123, LocalDate.now(), 20000,
                                          "Jens", "jens@email.com", "passord123");
    @Nested
    @DisplayName("Testing switching from basic to silver membership")
    public class switchingFromBasicToSilverMembership {

        @Test
        @DisplayName("Is bonus points added correctly when switching from basic to silver membership")
        public void isBonusPointsAddedCorrectlyWhenSwitchingFromBasicToSilver() {
            bonusMember.registerBonusPoints(5000);
            bonusMember.registerBonusPoints(5000);
            assertTrue(bonusMember.getBonusPointBalance() == 31000);
        }

        @Test
        @DisplayName("Is membership name changed correctly when switching form basic to silver membership")
        public void isMembershipNameChangedFromBasicToSilver() {
            assertEquals(bonusMember.getMembershipName(), "BASIC");
            bonusMember.registerBonusPoints(5000);
            assertEquals(bonusMember.getMembershipName(), "SILVER");
        }
    }

    @Nested
    @DisplayName("Testing switching from silver to gold membership")
    public class switchingFromSilverToGoldMembership {

        @Test
        @DisplayName("Is bonus points added correctly when switching from silver to gold membership")
        public void isBonusPointsAddedCorrectlyWhenSwitchingFromSilverToGold() {
            bonusMember.registerBonusPoints(60000);
            bonusMember.registerBonusPoints(10000);
            assertTrue(bonusMember.getBonusPointBalance() == 93000);
        }

        @Test
        @DisplayName("Is membership name changed correctly when switching form silver to gold membership")
        public void isMembershipNameChangedFromSilverToGold() {
            bonusMember.registerBonusPoints(5000);
            assertEquals(bonusMember.getMembershipName(), "SILVER");
            bonusMember.registerBonusPoints(60000);
            assertEquals(bonusMember.getMembershipName(), "GOLD");
        }
    }

    @Test
    public void isMembershipNameChangedFromBasicToGold () {
        assertEquals(bonusMember.getMembershipName(), "BASIC");
        bonusMember.registerBonusPoints(100000);
        assertEquals(bonusMember.getMembershipName(), "GOLD");
    }

}

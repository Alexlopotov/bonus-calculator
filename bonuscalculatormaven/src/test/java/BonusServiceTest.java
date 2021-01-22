import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldcalculateRegistredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

        @org.junit.jupiter.api.Test
        void shouldCalculateForRegisteredAndOverLimit () {
            BonusService service = new BonusService();

            long amount = 2_000_000_60;
            boolean registered = true;
            long expected = 500;

            long actual = service.calculate(amount, registered);

            assertEquals(expected, actual);
        }
    @org.junit.jupiter.api.Test
    void shouldcalculateNotRegistredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = false;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldcalculateNotRegistredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    }
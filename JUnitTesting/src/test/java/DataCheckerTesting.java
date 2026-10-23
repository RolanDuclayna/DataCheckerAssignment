import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DataCheckerTesting {

    DataChecker datachecker = new DataChecker();

    @Test
    public void testMonth() {
        assertTrue(datachecker.has31(DataChecker.Month.JANUARY));
    }

    @Test
    public void testMonthWithout31Days() {
        assertFalse(datachecker.has31(DataChecker.Month.NOVEMBER));
    }

    @ParameterizedTest
    @EnumSource (
            value = DataChecker.Month.class,
            names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"}
    )
    public void parameterizedTest(DataChecker.Month month) {
        assertTrue(datachecker.has31(month));
    }

    @Test
    public void edgeCase() {
        assertFalse(datachecker.has31(DataChecker.Month.FEBRUARY));
    }

    @Test
    public void testNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            datachecker.has31(null);
        });
    }


}

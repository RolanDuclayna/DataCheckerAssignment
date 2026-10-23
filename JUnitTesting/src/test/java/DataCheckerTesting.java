import org.junit.jupiter.api.Test;


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
}

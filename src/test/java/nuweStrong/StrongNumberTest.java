package nuweStrong;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StrongNumberTest {

    //StrongNumber sn = new StrongNumber();

    @ParameterizedTest
    @CsvSource({"1,STRONG!!!!", "2,STRONG!!!!", "145,STRONG!!!!", "146,Not Strong !!", "40585,STRONG!!!!", "40586,Not Strong !!"})
    void calcularStrong(int num, String esperat) {
        assertEquals(esperat, StrongNumber.isStrongNumber(num));
    }

}
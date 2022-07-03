package nuweCoupon;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CouponValidatorTest {

    @ParameterizedTest
    @CsvSource(value = {"abc|abc|July 9, 2015|July 9, 2015",
            "abc|abc|July 9, 2015|July 9, 2016",
            "abc|abc|July 9, 2015|July 10, 2015",
            "abc|abc|June 9, 2015|July 9, 2015"
    }, delimiter = '|')
    void checkCouponCorrect(String inCode, String riCode, String current, String expiration) {
        assertTrue(CouponValidator.checkCoupon(inCode, riCode, current, expiration));
    }

    @ParameterizedTest
    @CsvSource(value = {"abc|abc|July 10, 2015|July 9, 2015",
            "abc|abcd|July 9, 2015|July 9, 2016",
            "abc|abc|July 11, 2015|July 10, 2015",
            "abc|abc|June 9, 2016|July 9, 2015",
            "abc|abc|June 9, 2015|July 9, 1015"
    }, delimiter = '|')
    void checkCouponIncorrect(String inCode, String riCode, String current, String expiration) {
        assertFalse(CouponValidator.checkCoupon(inCode, riCode, current, expiration));
    }
}
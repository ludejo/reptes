package nuweCoupon;

import java.util.ArrayList;
import java.util.Arrays;

public class CouponValidator {

    private static final ArrayList<String> months = new ArrayList<>(Arrays.asList(
            "january", "february", "march", "april", "may", "june",
            "july", "august", "september", "october", "november", "december"));

    public static boolean checkCoupon(String enteredCode, String correctCode, String currentDate, String expirationDate) {
        return enteredCode.equals(correctCode) && cleanDate(currentDate) <= cleanDate(expirationDate);
    }

    public static int cleanDate(String date) {
        String[] parts = date.toLowerCase().replaceAll(",", "").split(" ");
        if (parts[1].length() < 2) {
            parts[1] = "0" + parts[1];
        }
        parts[0] = String.valueOf(months.indexOf(parts[0]) + 1);
        if (parts[0].length() < 2) {
            parts[0] = "0" + parts[0];
        }
        return Integer.parseInt(parts[2] + parts[0] + parts[1]);
    }
}

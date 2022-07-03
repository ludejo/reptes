package nuweStrong;

import java.util.Arrays;

public class StrongNumber {
    private static final int[] values = new int[9];

    public StrongNumber() {
        //això es pot fer aquí...?
        values[0] = 1;
        for (int i = 1; i < 9; i++) values[i] = values[i - 1] * (i + 1);
    }

    public static String isStrongNumber(int num) {

        //Array amb valors de factorials 1-9
        //int[] values = new int[9];
        //values[0] = 1;
        //for (int i = 1; i < 9; i++) values[i] = values[i - 1] * (i + 1);

        // Reordenar enter (0->1)
        String numString = String.valueOf(num).replace("0", "1");
        char[] ar = numString.toCharArray();
        Arrays.sort(ar);
        int numSorted = Integer.parseInt(String.valueOf(ar));

        // Restar factorials de número original fins a <0
        int acc = num;
        while (acc > 0) {
            int residu = numSorted % 10;
            System.out.println(residu);
            numSorted = (numSorted - residu) / 10;
            acc -= values[residu - 1];
        }
        return (acc == 0) ? "STRONG!!!!" : "Not Strong !!";
    }
}

package nuweLambda;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

public class MyLambda {
    IntFunction<String> isOdd = x -> x % 2 != 0 ? "true" : "false";

    IntFunction<String> isPrime = x -> {
        boolean flag = false;
        for (int i = 2; i <= x / 2; ++i) {
            if (x % i == 0) {
                flag = true;
                break;
            }
        }
        return String.valueOf(!flag);
    };

    IntFunction<String> isPalindrome = x -> {
        String original = String.valueOf(x);
        StringBuilder reversa = new StringBuilder(original);
        return original.equals(reversa.reverse().toString()) ? "true" : "false";
    };

    IntConsumer output = x -> {
        String result = "NOT A POSSIBLE OPTION";
        if (x != 0) {
            result = String.format(
                    "{\n\tinput:%d," +
                            "\n\tisOdd:%s," +
                            "\n\tisPrime:%s," +
                            "\n\tisPalindrome:%s,\n\t}",
                    x, isOdd.apply(x), isPrime.apply(x), isPalindrome.apply(x));
        }
        System.out.println(result);
    };

    public void checker(int... values) {
        Arrays.stream(values).forEach(output);
    }
}
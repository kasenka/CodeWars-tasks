package test.some;

import java.util.Arrays;

public class doublee {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x*2).toArray();
    }
}

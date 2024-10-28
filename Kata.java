package test.some;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        List<Integer> sorted_a = new ArrayList<>();;
        boolean flag = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] == a[i]){
                    flag = false;
                    break;
                }
            }
            if (flag) {sorted_a.add(a[i]);}
            flag = true;
        }
        int[] resultArray = new int[sorted_a.size()];
        for (int i = 0; i < sorted_a.size(); i++) {
            resultArray[i] = sorted_a.get(i);
        }

        return resultArray;
    }
}

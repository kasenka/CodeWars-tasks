package test.some;

import java.util.Arrays;

public class sum{

    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(x -> x>0).sum();
    }

}

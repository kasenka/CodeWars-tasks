package test.some;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

class PickPeaks {
    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        Map<String,List<Integer>> result = Map.of(
                "pos",   new ArrayList<Integer>(),
                "peaks", new ArrayList<Integer>()
        );
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i-1] < arr[i]){
                int nextI = i+1;

                while (arr[i] == arr[nextI] && (nextI +1) < arr.length){ // пропуск чисел равных текущему
                    nextI +=1;
                }
                if (arr[i] > arr[nextI]){
                    result.get("pos").add(i);
                    result.get("peaks").add(arr[i]);
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPeaks(new int[]{1, 2, 3, 3, 0}));
    }
}


package test.some;

public class parityBit {
    public static String pparityBit(String str){
        String[] arr = str.split(" ");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            boolean bit = (arr[i].chars().filter(x -> x == '1').count()) % 2 == 0;
            if (bit) { result += arr[i].substring(0,arr[i].length()-1) + " ";}
            else {result += "error ";}
        }
        return result;
    }
}

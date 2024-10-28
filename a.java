package test.some;

public class a {

    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (char c: s.toCharArray()){
            result.append(Character.toUpperCase(c));
            result.append(String.valueOf(c).toLowerCase().repeat(i));
            result.append('-');
            i++;
        }return result.deleteCharAt(result.length()-1).toString();
    }
}

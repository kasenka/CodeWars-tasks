package test.some;

public class Solution {
    public static String camelCase(String input) {
        StringBuilder res = new StringBuilder();
        input.chars().forEach(x -> {
            if (Character.isUpperCase(x)) {
                res.append(' ').append((char) x);
            } else {
                res.append((char) x);
            }
        });
        return res.toString();
    }
}

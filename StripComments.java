package test.some;

import java.util.regex.Pattern;

class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String pattern;
        String result = "";
        String escapedSymbols = String.join("", commentSymbols)
                .replace("\\", "\\\\")  // Экранирование обратного слэша
                .replace(".", "\\.")    // Экранирование точки
                .replace("[", "\\[")    // Экранирование квадратной скобки
                .replace("]", "\\]");   //

        pattern = "(?m)\\s*[" + String.join("|", escapedSymbols) + "].*";
        result = text.replaceAll(pattern,"").trim();


        return result;
    }
    public static void main(String[] args) {
//        System.out.println(stripComments("apples, pears     # and bananas\ngrapes\nbananas       !apples      ",new String[] {"#", "!"}));
//        System.out.println(stripComments("a #b\nc\nd $e f g", new String[] { "#", "$" }));
//        System.out.println(stripComments("\t# apples - apples apples\n=\n^" ,new String[] {",", "!", "^", ".", "=", "?", "'", "#", "-"}));
        System.out.println(stripComments("<a[[\n b ]]\nc>", new String[]{"[","]"}));
    }
}


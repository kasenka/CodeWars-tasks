package test.some;

import java.util.*;

public class RomanNumerals {

    public static String toRoman(int n) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[n / 1000] +
                hundreds[(n % 1000) / 100] +
                tens[(n % 100) / 10] +
                ones[n % 10];
    }

    public static int fromRoman(String romanNumeral) {
        Map<Character,Integer> romanToArab = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int resultArabNumber = 0;
        int current = 0;
        int prev = romanToArab.get(romanNumeral.charAt(romanNumeral.length()-1));

        resultArabNumber += prev;
        for (int i = romanNumeral.length()-2; i >= 0  ; i--) { // идем справа на лево
            current = romanToArab.get(romanNumeral.charAt(i)); //находим  соответственную  араб цифр

            if (prev > current){ resultArabNumber -= current;}
            else {resultArabNumber += current;}
            prev = current;
        }

        return resultArabNumber;
    }
}

package test.some;

import java.util.*;

public class s {
    public  static boolean check(String sentence) {
        sentence = sentence.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char ch: sentence.toCharArray()){
            if (ch >= 'a' && ch <= 'z') {set.add(ch);}
        }
        return set.size() == 26;
    }
}

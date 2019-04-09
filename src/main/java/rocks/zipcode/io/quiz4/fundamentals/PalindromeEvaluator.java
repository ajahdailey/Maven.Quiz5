package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        Set<String> list = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    list.add(string.substring(i, j+ 1));

                }
            }
        }
        String[] all = new String[list.size()];
        return list.toArray(all);
    }

    public static Boolean isPalindrome(String string) {
        for(int i = 0; i < string.length() / 2; i++)
        {
            if(string.charAt(i) != string.charAt(string.length() - 1 - i))
                return false;
        }
        return true;
    }


    public static String reverseString(String string) {

        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }

        return reverse;
    }
}

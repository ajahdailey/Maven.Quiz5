package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> list = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String substring = string.substring(i, j);
                list.add(substring);
            }
        }

        String[] all = new String[list.size()];
        return list.toArray(all);

        }


    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> list = new HashSet<>();

        for (int i = 0; i < string1.length(); i++) {
            for (int j = i + 1; j <= string1.length(); j++) {
                String substring1 = string1.substring(i, j);
                for (int k = 0; k < string2.length(); k++) {
                    for (int l = k + 1; l <= string2.length(); l++) {
                        String substring2 = string2.substring(k, l);
                   if(substring1.equals(substring2)){
                       list.add(substring1);
                   }
                    }
                }
            }
        }

        String[] all = new String[list.size()];
        return list.toArray(all);

        }



    public static String getLargestCommonSubstring(String string1, String string2) {
     String[] largestCommon = getCommonSubstrings(string1, string2);
        String temp = largestCommon[0];
        for (String string : largestCommon) {
           if(temp.length() < string.length()){
               temp = string;
           };

        }
       return temp;

    }
}

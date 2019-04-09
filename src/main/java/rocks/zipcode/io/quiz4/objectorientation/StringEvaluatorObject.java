package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
     String str;
     StringEvaluator stringEvaluator;

    public StringEvaluatorObject(String str) {
    this.str = str;
    this.stringEvaluator = new StringEvaluator();
    }

    public String[] getAllSubstrings() {
        return StringEvaluator.getAllSubstrings(str);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(str , secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return StringEvaluator.getLargestCommonSubstring(str, secondInput);
    }
}

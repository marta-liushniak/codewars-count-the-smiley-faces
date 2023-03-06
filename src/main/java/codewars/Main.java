package codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add(";D");
        stringList.add(":-()");
        stringList.add(":-)");
        stringList.add(";~)");

        System.out.println(countSmileys(stringList));
    }

    /**
     * Counts the number of smiley faces in the given list of strings.
     *
     * A smiley face is defined as a string that matches the following pattern:
     *   - starts with a colon (:) or semicolon (;)
     *   - optionally followed by a hyphen (-) or tilde (~)
     *   - ends with a closing parenthesis () or uppercase letter D
     *
     * @param arr the list of strings to search for smiley faces
     * @return the number of smiley faces found in the list
     */
    public static int countSmileys(List<String> arr) {
        Pattern pattern = Pattern.compile("[:;][-~]?[)D]");
        int count = 0;
        for (String str : arr) {
            if (str.matches(String.valueOf(pattern))) {
                count++;
            }
        }
        return count;
    }
}

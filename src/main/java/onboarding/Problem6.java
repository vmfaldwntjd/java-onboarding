package onboarding;

import java.util.List;

public class Problem6 {

    public static boolean check(String s1, String s2) {
        for (int i = 0; i < s1.length() - 1; ++i) {
            for (int j = 0; j < s2.length() - 1; ++j) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (s1.charAt(i + 1) == s2.charAt(j + 1)) {
                        return true;
                    } else {
                        ++j;
                    }
                }
            }
        }
        return false;
    }

    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    }
}

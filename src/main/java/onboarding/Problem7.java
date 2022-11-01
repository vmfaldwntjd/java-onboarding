package onboarding;

import java.util.*;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = new ArrayList<>();
        List<String> userFriends = new ArrayList<>();
        for (int i = 0; i < friends.size(); ++i) {
            if (friends.get(i).get(0).equals(user)) {
                userFriends.add(friends.get(i).get(1));
            } else if (friends.get(i).get(1).equals(user)) {
                userFriends.add(friends.get(i).get(0));
            }
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < friends.size(); ++i) {
            for (int j = 0; j < 2; ++j) {
                if (!friends.get(i).get(j).equals(user) && !map.containsKey(friends.get(i).get(j))) {
                    map.put(friends.get(i).get(j), 0);
                }
            }
        }
        return answer;
    }
}

package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SiteMap {
//https://www.careercup.com/question?id=5701929771466752
    public static class UserPage {
        private String user;
        private int page;

        public UserPage(String user, int page) {
            this.user = user;
            this.page = page;
        }
    }

    public static void main(String[] args) {

        UserPage[] userPages = {
                new UserPage("A", 1),
                new UserPage("B", 5),
                new UserPage("A", 2),
                new UserPage("A", 1),
                new UserPage("B", 2),
                new UserPage("C", 7),
                new UserPage("C", 3),
                new UserPage("A", 3),
                new UserPage("C", 1)
        };

        Map<String, Integer> latestPageMap = new HashMap<>();
        Map<Integer, Set<Integer>> result = new TreeMap<>();

        for (UserPage userPage : userPages) {
            int value = userPage.page;
            if (!latestPageMap.containsKey(userPage.user)) {
                latestPageMap.put(userPage.user, value);
                if (!result.containsKey(value)) {
                    result.put(value, new HashSet<Integer>());
                }
            } else {
                int previousLatest = latestPageMap.get(userPage.user);
                latestPageMap.put(userPage.user, value);
                if (!result.containsKey(previousLatest)) {
                    result.put(previousLatest, new HashSet<Integer>());
                }
                Set<Integer> tempSet = result.get(previousLatest);
                tempSet.add(value);
                result.put(previousLatest, tempSet);
            }
        }

        for (int finalValue : result.keySet()) {
            System.out.print(finalValue + " -> ");
            Set<Integer> linkedPages = result.get(finalValue);
            for (int linkedPage : linkedPages) {
                System.out.print(linkedPage + " ");
            }
            System.out.println();
        }
    }
}
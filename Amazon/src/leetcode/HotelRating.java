package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//https://www.careercup.com/question?id=5633477589336064
public class HotelRating {

    public static class Score {
        private int hotel_id;
        private int user_id;
        private int score;

        public Score(int hotel_id, int user_id, int score) {
            this.hotel_id = hotel_id;
            this.user_id = user_id;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Score[] scores = {
                new Score(1001, 501, 7),
                new Score(1001, 502, 7),
                new Score(1001, 503, 7),
                new Score(2001, 504, 10),
                new Score(3001, 505, 5),
                new Score(2001, 506, 5)
        };

        //int min_avg_score = 7;
        int min_avg_score = 5;

        System.out.println(get_hotels(scores, min_avg_score));
    }

    private static List<Integer> get_hotels(Score[] scores, int min_avg_score) {
        Map<Integer, List<Integer>> averageMap = new TreeMap<>();
        for (Score score : scores) {
            if (!averageMap.containsKey(score.hotel_id)) {
                averageMap.put(score.hotel_id, new ArrayList<Integer>());
            }
            List<Integer> tempList = averageMap.get(score.hotel_id);
            tempList.add(score.score);
            averageMap.put(score.hotel_id, tempList);
        }

        List<Integer> finalList = new ArrayList<>();

        for (int hotel_id : averageMap.keySet()) {
            List<Integer> hotelScoreList = averageMap.get(hotel_id);
            int totalScore = 0;
            for (int score : hotelScoreList) {
                totalScore += score;
            }
            float averageScore = (float) totalScore / hotelScoreList.size();
            if (averageScore >= min_avg_score) {
                finalList.add(hotel_id);
            }
        }
        return finalList;
    }
}

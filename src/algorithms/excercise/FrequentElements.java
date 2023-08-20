package algorithms.excercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> summary = new ArrayList<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < k; i++)
            summary.add(entries.get(i)
                    .getKey());
        return summary.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        FrequentElements ele = new FrequentElements();
        ele.topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2);
    }
}

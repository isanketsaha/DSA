package algorithms.excercise;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) +1);
        for(char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0) - 1);

      for( int i : map.values())
          if(i != 0)
              return false;
      return true;
    }

    public static void main(String[] args) {
        Anagram al = new Anagram();
        System.out.println(al.isAnagram("cat", "rat"));
    }
}

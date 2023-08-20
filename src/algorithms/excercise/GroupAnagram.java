package algorithms.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Character>, List<String>> map = new HashMap<>();
        for(String str : strs){
            List<Character> characterList = str.chars()
                    .mapToObj(e -> (char) e)
                    .collect(Collectors.toList());
            Collections.sort(characterList);
            List<String> orDefault = map.getOrDefault(characterList, new ArrayList<>());
            orDefault.add(str);
            map.put(characterList, orDefault);
        }
        return map.values().stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        GroupAnagram g =new GroupAnagram();
        g.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}

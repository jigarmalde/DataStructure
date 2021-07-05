package com.ds.pratice.DataStructure.LeetCode.Array;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args){
        String[] str = new String[]{"eat","tea","tan","ate","nat","bat"};

        groupAnagrams(str);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String> > map = new HashMap<>();
        for(String s : strs){
            //char[] c = s.toCharArray();
            //Array.sort(c);
            char[] ca = new char[26];
            for (char char1 : s.toCharArray()) ca[char1 - 'a']++;
            String str = String.valueOf(ca);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);

        }
        list.addAll(map.values());

        return list;

    }

}

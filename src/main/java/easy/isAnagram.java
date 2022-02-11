import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
		String longStr=s;
		String shotStr=t;
		if(s.length()<t.length()){
			longStr = t;
			shotStr = s;
		}

		Map<Character,Integer> anagramMap = new HashMap<>();
		for(Character c : longStr.toCharArray()){
			if (anagramMap.containsKey(c)) {
				anagramMap.replace(c, anagramMap.get(c) + 1);
			} else {
				anagramMap.put(c, 1);
			}
		}
		for(Character c : shotStr.toCharArray()){
			if(!anagramMap.containsKey(c))
				return false;
			anagramMap.replace(c,anagramMap.get(c)-1);
		}

		for(Integer count: anagramMap.values()){
			if(count!=0)return false;
		}
		return true;

	}
}

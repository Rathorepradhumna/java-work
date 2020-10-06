package AssignmentTwo;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
	public int findDuplicates(String str) {
		int countDuplicates = 0;
		str  = str.toLowerCase();
		Map<Character , Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for(Integer i : map.values()) {
			if(i>1) {
				countDuplicates++;
			}
		}
		return countDuplicates;
	}
}

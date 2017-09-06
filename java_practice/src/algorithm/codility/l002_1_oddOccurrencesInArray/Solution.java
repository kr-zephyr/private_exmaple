package algorithm.codility.l002_1_oddOccurrencesInArray;
// you can also use imports, for example:
// import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// 

class Solution {
	public int solution(int[] A) {
		Map<Integer, Integer> matchMap = new HashMap<>();
		
		for(int a : A) {
			if(matchMap.containsKey(a)) {
				matchMap.put(a, matchMap.get(a) + 1);
			} else {
				matchMap.put(a, 1);
			}
		}
		
		Iterator<Integer> it = matchMap.keySet().iterator();
		int key = 0;
		while(it != null && it.hasNext()) {
			key = it.next();
			if(1 == matchMap.get(key)) {
				break;
			}
		}
		
		return key;
	}
}

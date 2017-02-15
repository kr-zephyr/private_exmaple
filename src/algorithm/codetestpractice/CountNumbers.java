package com.sz21c.cp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자

 10 = 1, 0
 11 = 1, 1
 12 = 1, 2
 13 = 1, 3
 14 = 1, 4
 15 = 1, 5

 그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개
 */
public class CountNumbers {
    public static void main(String[] args) {
        String sNum = "0";
        String eNum = "1000";
        int cNum = Integer.valueOf(sNum);

        Map<String, Integer> countMap = new HashMap<>();

        // 재귀로 처리할 수도 있을 것 같음
        do {
            char[] charArray = String.valueOf(cNum).toCharArray();
            for(char c : charArray) {
                countNum(countMap, c);
            }
        } while(++cNum <= Integer.valueOf(eNum));

        // Java8 Stream으로 개선할 수 있음
        Set<String> keySet = countMap.keySet();
        for (Object key : keySet) {
            System.out.println(key + ":" + countMap.get(key) + "개");
        }
    }

    private static void countNum(Map<String, Integer> countMap, char currentNum) {
        if(countMap.containsKey(String.valueOf(currentNum))) {
            int count = countMap.get(String.valueOf(currentNum));
            countMap.put(String.valueOf(currentNum), count + 1);
        } else {
            countMap.put(String.valueOf(currentNum), 1);
        }
    }
}

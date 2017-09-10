package algorithm.codility.l004_2_perm_check;

// test case
// [1,3,4,5,3]
// [1,1]
// []
// [2,3,4]
// [1]
// [2]

// you can also use imports, for example:
// import java.util.*;
import java.util.Map;
import java.util.HashMap;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int isPermutation = 0;
        Map<Integer, Integer> pMap = new HashMap<>();

        int minVal = A.length > 0 ? A[0] : 0;
        int maxVal = minVal;

        for(int a : A) {
            if(pMap.containsKey(new Integer(a))) return 0;
            else pMap.put(new Integer(a), 1);

            if(a < minVal) minVal = a;
            if(a > maxVal) maxVal = a;
        }

        isPermutation = (((maxVal - minVal) + 1) == A.length) && minVal == 1 ? 1 : 0;

        return isPermutation;
    }
}


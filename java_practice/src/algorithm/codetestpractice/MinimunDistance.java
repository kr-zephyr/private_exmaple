package algorithm.codetestpractice;

import java.util.Map;
import java.util.HashMap;

// test case
// [7, 21, 3, 42, 2, 7]
// [1, 1]
// [1, 2]
//[0, 0]
//[0, 1]
//[1, 2, 3]
//[8, 24, 3, 20, 1, 17]
//[7, 21, 3, 42, 3, 7]
public class MinimunDistance {
    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        int distance = -1;
        int minVal = 1000001;
        int secVal = 1000001;
        Map<Integer, Integer> matchMap = new HashMap<>();

        for(int i = 0; i < A.length; i++) {
            if(matchMap.containsKey(A[i])) {
                distance = 0;
                break;
            } else {
                matchMap.put(A[i], 1);
            }

            if(A[i] < minVal) {
                secVal = minVal;
                minVal = A[i];
            }
            else if(A[i] < secVal) {
                secVal = A[i];
            }
        }

        if(distance == -1) distance = (minVal - secVal) < 0 ? (minVal - secVal) * -1 : (minVal - secVal);

        return distance;
    }
}

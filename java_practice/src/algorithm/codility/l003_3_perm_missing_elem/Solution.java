package algorithm.codility.l003_3_perm_missing_elem;
// you can also use imports, for example:
// import java.util.*;
import java.util.stream.IntStream;
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        if(A.length == 0) return 1;

        IntStream intStream = Arrays.stream(A);
        A = intStream.sorted().toArray();

        if(A[0] != 1) return 1;

        int missingNum = 0;

        for(int i = 0; i < A.length - 1; i++) {
            if(A[i + 1] - A[i] > 1) {
                missingNum = A[i] + 1;
                break;
            }
        }

        if(missingNum ==0 && A.length < 100000) missingNum = A.length + 1;

        return missingNum;
    }
}
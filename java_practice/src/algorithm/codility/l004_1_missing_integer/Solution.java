package algorithm.codility.l004_1_missing_integer;

// you can also use imports, for example:
// import java.util.*;
import java.util.stream.IntStream;
        import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int missingInt = 1;

        IntStream intStream = Arrays.stream(A);
        A = intStream.sorted().distinct().toArray();

        // 시작이 1 이상이 되는 시작 지점의 index를 찾는다
        int positiveIdx = -1;
        for(int i = 0;i < A.length; i++) {
            if(A[i] > 0) {
                positiveIdx = i;
                break;
            }
        }

        // 시작 지점이 초기값(모두 음수)이거나 1이 아니면 1을 반환
        if(positiveIdx == -1 || A[positiveIdx] != 1) return missingInt;

        // 시작 지점부터 현재, 현재 + 1의 값을 비교하여 비어있는 값이 있는지 찾는다.
        for(int i = positiveIdx; i < A.length - 1; i++) {
            if(A[i] > 0 && (A[i] + 1) != A[i + 1]) {
                return A[i] + 1;
            }
        }

        // 전체를 찾았는데 모든 값이 있으면 마지막 값에서 + 1한 값을 반환한다
        if(A.length > 0 && A[positiveIdx] == 1) missingInt = A[A.length - 1] + 1;

        return missingInt;
    }
}
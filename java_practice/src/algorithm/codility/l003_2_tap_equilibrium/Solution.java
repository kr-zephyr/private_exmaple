package algorithm.codility.l003_2_tap_equilibrium;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int sum = 0;
        int[] aa = new int[A.length - 1];   // 공간을 1이라도 적게 써보려는 몸부림...
        int minGap = 2001;  // 주어진 조건에서 최대 gap으로 가질 수 있는 값은 2000이므로...

        // 무식하지만... 전체 순회하면서 모든 값의 합과 각 index를 지나가면서 합산되는 값을 저장하여 아래에서 검사한다. 그래봐야 O(N)이다...라고 위안을..
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
            if(i < A.length - 1) aa[i] = sum;
        }

        for(int i = 0; i < aa.length; i++) {
            int gap = ((sum - aa[i]) - aa[i]) < 0 ?
                    (((sum - aa[i]) - aa[i]) * -1) : ((sum - aa[i]) - aa[i]);   // gap은 음수가 될 수 없으므로..
            // System.out.println("aa[" + i + "] :: " + aa[i] + ", gap :: " + gap);
            if(minGap > gap)
                minGap = gap;
        }

        // System.out.println("sum : " + sum + ", minGap : " + minGap);

        return minGap;
    }
}
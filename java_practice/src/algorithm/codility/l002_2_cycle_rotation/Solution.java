package algorithm.codility.l002_2_cycle_rotation;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public int[] solution(int[] A, int K) {
		if(A == null || A.length < 1) return new int[0];
		if(K != 0 && K % A.length == 0) return A;
		if(A.length < K) {
			K = K - (A.length * (K / A.length));
		}
		
		int[] splitArray = new int[K];
		
		System.arraycopy(A, A.length - K, splitArray, 0, K);
		System.arraycopy(A, 0, A, K, A.length - K);
		System.arraycopy(splitArray, 0, A, 0, splitArray.length);
		
		return A;
	}
}
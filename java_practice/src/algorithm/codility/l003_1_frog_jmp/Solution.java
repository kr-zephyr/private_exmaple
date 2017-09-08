package algorithm.codility.l003_1_frog_jmp;

// you can also use imports, for example:
// import java.util.*;
import java.lang.Math;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public int solution(int X, int Y, int D) {
		// System.out.println(((Y - X) / D) + ", " + Math.ceil((Y - X) / (double) D));
		int jmpCnt = (int) Math.ceil((Y - X) / (double) D);
		return jmpCnt < 0 ? 0 : jmpCnt;
	}
}
package algorithm.codility.l003_1_frog_jmp;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        return (((Y / D) * D) + X) >= Y ? ((Y - X) / D) : ((Y - X) / D) + 1;
    }
}

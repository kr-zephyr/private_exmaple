package algorithm.codility.l001_binary_gap;

public class BinaryGap {
	
//	final static int N = 21474836;
	final static int N = 9;
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Integer.toBinaryString(N));
		System.out.println(N + " :: " + solution.solution(N));
	}
	
	static class Solution {
		public int solution(int N) {
			int countZeros = 0;
			int maxZeroCount = 0;
			boolean startedOne = false;
			
			while(N > 0) {
				if(startedOne && N % 2 == 0) {
					countZeros++;
				} else {
					if(startedOne && maxZeroCount < countZeros) {
						maxZeroCount = countZeros;
						countZeros = 0;
					}
					startedOne = true;
				}
				N = N / 2;
			}
			
			return maxZeroCount;
		}
	}
}

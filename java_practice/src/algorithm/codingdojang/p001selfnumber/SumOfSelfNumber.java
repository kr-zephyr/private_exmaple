package algorithm.codingdojang.p001selfnumber;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩도장 1번 문제 (http://codingdojang.com/scode/365)
 * 
 * 어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
 *
 * 예를 들어
 *
 * d(91) = 9 + 1 + 91 = 101
 * 이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.
 *
 * 어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다. 그런데 반대로, 제네레이터가 없는 숫자들도 
 * 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다. 예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.
 *
 * 1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.
 * 
 * --> 풀이 방향
 * 1 ~ 5000의 각 값을 연산하여 제네레이터를 가질 수 있는 값을 찾은 후 제네레이터를 가지지 못한 값을 추출하는 방식...
 * 좀 더 개선해 볼 부분들이 있을 듯...
 * 
 * --> 소요시간
 * 1시간 정도??
 */
public class SumOfSelfNumber {
	
	private static final int MAX_NUM = 5000;
	
	public static void main(String[] args) {
		List<Integer> hasGenerators = new ArrayList<>();
		int sumSelfNum = 0;
		
		for(int i = 1; i < MAX_NUM; i++) {
			String num = String.valueOf(i);
			int sumOfNumElement = 0;
			
			//TODO 재귀로 풀면 sumOfNumElement 필요 없을 듯
			for(int j = 0; j < num.length(); j++) {
				sumOfNumElement += Integer.valueOf(num.substring(j, j + 1));
			}
			
			hasGenerators.add(sumOfNumElement + i);
		}
		
		for(int i = 0; i < MAX_NUM; i++) {
			//TODO 재귀나 스트림으로 풀면 sumSelfNum 제거 가능
			if(!hasGenerators.contains(i)) {
				sumSelfNum += i;
			}
		}
		
		System.out.println("sum of self number is " + sumSelfNum);
	}
}

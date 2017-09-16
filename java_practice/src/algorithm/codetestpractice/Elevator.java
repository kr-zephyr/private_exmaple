package algorithm.codetestpractice;

import java.util.Map;
import java.util.HashMap;

// 사람들이 호텔에서 엘리베이터를 기다리고 있다
// 엘리베이터의 용량은 제한되어 있으며 이동량을 분석하고 싶습니다.
//
// 이 호텔에는 0 층부터 1 층까지의 층이 있습니다.
// 엘리베이터의 최대 수용 인원은 X 명이며 무게 제한은 Y입니다.
// 1 층에 모인 N 명이 엘리베이터 대기열에 있습니다.
// 모든 사람의 체중 A [K]와 대상 층 B [K]가 주어집니다.
// (즉, A [0]과 B [0]은 대기열의 첫 번째 사람을 나타냅니다.)
//
// 사람들은 대기열에있는 위치의 순서대로 (그리고 대상 층에 대한 버튼을 누르십시오) 엘리베이터에 들어가기를 기다립니다.
// (대기열 중간에서 특정 사람에 대해 엘리베이터에 여유 공간이 있더라도 대기열 순서는 변경할 수 없습니다.)
// 그런 다음 엘리베이터가 올라가서 선택한 모든 층에서 멈추고 마침내 1 층으로 돌아갑니다.
// 이 프로세스는 대기열에 더 이상 사람이 없을 때까지 반복됩니다.
// 목표는 엘리베이터가 멈추는 총 횟수를 세는 것입니다.
//
// 예를 들어, 0부터 M = 5까지 번호가 매겨지고 최대 용량이 X = 2 인 엘리베이터와 Y = 200의 무게 제한이있는 호텔을 생각해보십시오.
// 무게 A와 목표 층 B는 다음과 같습니다.
//
//
// 엘리베이터는 처음 2 명의 승객을 모아서 2 층과 3 층에서 멈추고 1 층으로 돌아갑니다.
// 그러면 마지막 승객이 걸리고 5 층에 들러 1 층으로 돌아갑니다.
// 전체적으로 엘리베이터가 5 번 멈 춥니 다.
// 이 번호는 1 층의 마지막 정거장을 포함합니다.

// test case
//[[60], [2], 5, 2, 200]
//[[60, 80, 40], [2, 3, 6], 5, 2, 200]
//[[], [], 5, 3, 300]
public class Elevator {
    public static void main(String[] args) {
        int[] A = {40,40,100,80,20};
        int[] B = {3,3,2,2,3};
        System.out.println(solution(A, B, 7, 5, 200));
    }

    public static int solution(int[] A, int[] B, int M, int X, int Y) {
        Map<Integer, Integer> stopCountMap = new HashMap<>();
        int maxCapacity = 0;
        int maxWeight = 0;
        int stopCount = 0;

        for(int i = 0; i < A.length; i++) {
            if(stopCountMap.containsKey(B[i])) stopCountMap.put(B[i], stopCountMap.get(B[i]) + 1);
            else stopCountMap.put(B[i], 1);
            maxCapacity++;

            if((i + 1) == A.length || (stopCountMap.size() + 1) > X || (maxWeight + A[i]) > Y) {
                stopCount += maxCapacity + 1;
                stopCountMap = new HashMap<>();
                maxWeight = 0;
                maxCapacity = 0;
            }
        }

        return stopCount;
    }
}

package algorithm.codility.l004_3_frog_river_one;

/*
 * 작은 개구리가 강 저편에 도착하기를 원합니다.
 * 개구리는 처음에 강 하나의 위치 (0 번 위치)에 있으며 반대 위치의 은행 (위치 X + 1)에 도착하기를 원합니다.
 * 잎은 나무에서 강 표면으로 떨어집니다.
 *
 * 떨어지는 잎을 나타내는 N 개의 정수로 구성된 0 인덱스 배열 A가 주어집니다.
 * A [K]는 시간 K에서 한 잎이 떨어지는 위치를 초 단위로 나타냅니다.
 *
 * 목표는 개구리가 강 저편으로 점프 할 수있는 가장 빠른 시간을 찾는 것입니다.
 * 개구리는 1에서 X까지 강 건너편에 잎이 나타날 때만 교차 할 수 있습니다 (즉, 1에서 X까지의 모든 위치가 잎으로 덮여있는 가장 빠른 순간을 찾고 싶습니다).
 * 강에서 현재의 속도는 무시할 정도로 작다고 가정 할 수 있습니다. 즉 잎이 강에 떨어지면 위치가 바뀌지 않습니다.
 *
 * 예를 들어, 정수 X = 5와 배열 A는 다음과 같습니다.

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
두 번째 6에서는 잎이 위치 5에 떨어집니다. 이것은 강이 강을 가로 질러 모든 위치에 잎이 나타나는 가장 빠른 시간입니다.

Write a function:

class Solution { public int solution(int X, int[] A); }

N 정수와 정수 X로 구성된 0이 아닌 인덱스가없는 배열 A가 주어지면 개구리가 강 저편으로 점프 할 수있는 가장 빠른 시간을 반환합니다.

개구리가 강 저편으로 절대로 뛰어 오르지 않는다면 함수는 -1을 리턴해야합니다.

예를 들어, X = 5이고 배열 A는 다음과 같습니다.

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
함수는 위에서 설명한 것처럼 6을 반환해야합니다.

Assume that:
N과 X는 [1..100,000] 범위의 정수입니다.
배열 A의 각 요소는 [1..X] 범위 내의 정수입니다.

Complexity:
기대 최악의 경우의 시간 복잡도는 O (N)이다.
예상 최악의 경우의 공간 복잡도는 입력 저장소 (입력 인수에 필요한 저장소를 계산하지 않음)를 초과하는 O (X)입니다.
입력 배열의 요소를 수정할 수 있습니다.

test case
(5, [])
(5, [1])
(5, [5])
(2, [2, 2, 2])
(2, [3, 1, 5, 2, 7, 5, 2])
 */

public class Solution {
}

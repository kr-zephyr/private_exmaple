package algorithm.codetestpractice;

// N 개의 정수로 구성된 0 인덱스 배열 A가 제공됩니다.
// 배열 A의 요소는 함께 체인을 나타내며 각 요소는 체인의 각 링크의 강도를 나타냅니다.
// 이 사슬을 세 개의 작은 사슬로 나누고 싶습니다.
//
// 우리가 할 수있는 일은 정확하게 인접하지 않은 두 위치에서 체인을 끊는 것입니다.
// 보다 정확하게 우리는 링크 P, Q (0 <P <Q <N-1, Q-P> 1)를 깨뜨려 3 개의 체인 [0, P - 1], [P + 1, Q - 1] [Q + 1, N-1].
// 이 작업의 총 비용은 A [P] + A [Q]와 같습니다.
//
// 풀이 : 전체 배열 중 0과 N을 제외한 index 2개를 추출하여 합산한 값이 가장 작은 것 찾기
// 전체 순회하면서 가장 작은 값과 그것보다 큰 값을 찾는데(P < Q를 만족해야 한다), 각각의 index의 gap은 1 이상이어야 한다
// 각각 index의 gap은 1이상이어야 하므로 N - 2, N - 1는 최소값이 될 수 없다
public class DivideChain {
    public static void main(String[] args) {
        int[] A = {5, 2, 3, 5, 1, 6, 3, 5, 2, 5, 7, 29, 30};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int minVal = 1000000001;
        int secVal = 1000000001;

        for(int i = 1; i < (A.length - 3); i++) {
            if(A[i] < minVal) minVal = A[i];
            if(A[i + 2] < secVal && minVal < A[i + 2]) secVal = A[i + 2];
        }

        return minVal + secVal;
    }
}
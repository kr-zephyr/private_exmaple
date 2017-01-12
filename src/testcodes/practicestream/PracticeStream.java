package practicestream;

import java.util.Arrays;

public class PracticeStream {

    public static void main(String[] args) {
        Integer[] addValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 기본적인 for 반복문을 통한 처리
        printSumByFor(addValues);

        // 재귀함수를 이용한 처리 -> 단, 재귀함수는 call stack이 쌓이므로 for 반복문보다 비용이 더 들어간다.
        printSumByRecursive(addValues);

        // Java8 스트림의 reduce를 통한 처리 -> 1라인으로 처리 가능!!!
        printSumByStream(addValues);
    }

    static void printSumByFor(Integer[] addValues) {
        int sum = 0;
        for(int v : addValues) {
            sum += v;
        }
        System.out.println("[for] sum is " + sum);
    }

    static void printSumByRecursive(Integer[] addValues) {
        int sum = addMethod(0, addValues, 0);
        System.out.println("[재귀함수] sum is " + sum);
    }

    static int addMethod(int i, Integer[] addValues, int sum) {
        try {
            sum += addValues[i++];
            return addMethod(i, addValues, sum);
        } catch (ArrayIndexOutOfBoundsException e) {
        }

        return sum;
    }

    static void printSumByStream(Integer[] addValues) {
        int sum = Arrays.stream(addValues).reduce(0, (a, b) -> a + b);
        System.out.println("[스트림] sum is " + sum);
    }
}

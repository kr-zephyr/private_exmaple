package testcodes.practicestream;

import java.util.Arrays;

public class PracticeStream {

    public static void main(String[] args) {
        Integer[] addValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 기본적인 for 반복문을 통한 처리
        SumByFor sumByFor = new SumByFor(addValues);
        sumByFor.printSumByFor();

        // 재귀함수를 이용한 처리 -> 단, 재귀함수는 call stack이 쌓이므로 for 반복문보다 비용이 더 들어간다.
        SumByRecursive sumByRecursive = new SumByRecursive(addValues);
        sumByRecursive.printSumByRecursive();

        // Java8 스트림의 reduce를 통한 처리 -> 1라인으로 처리 가능!!!
        SumByStream sumByStream = new SumByStream(addValues);
        sumByStream.printSumByStream();
    }
}

class SumByFor {
    private Integer[] addValues;

    public SumByFor(Integer[] addValues) {
        this.addValues = addValues;
    }

    public void printSumByFor() {
        int sum = 0;
        for(int v : this.addValues) {
            sum += v;
        }
        System.out.println("[for] sum is " + sum);
    }
}

class SumByRecursive {
    private Integer[] addValues;

    public SumByRecursive(Integer[] addValues) {
        this.addValues = addValues;
    }

    public void printSumByRecursive() {
        System.out.println("[재귀함수] sum is " + addMethod(0, this.addValues, 0));
    }

    private int addMethod(int i, Integer[] addValues, int sum) {
        try {
            sum += addValues[i++];
            return addMethod(i, addValues, sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            return sum;
        }
    }
}

class SumByStream {
    private Integer[] addValues;

    public SumByStream(Integer[] addValues) {
        this.addValues = addValues;
    }

    public void printSumByStream() {
        System.out.println("[스트림] sum is " + Arrays.stream(this.addValues).reduce(0, (a, b) -> a + b));
    }
}
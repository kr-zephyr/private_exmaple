package algorithm.codetestpractice;

// test case
//0
//1
//36
//1001
//24
public class FizzBuzzWoof {

    public static void main(String[] args) {

    }

    public void solution(int N) {
        StringBuilder replaceStr = null;

        for(int i = 1; N > 0 && N <= 1000 && i <= N; i++) {
            replaceStr = new StringBuilder();

            if(i % 3 == 0) replaceStr.append("Fizz");
            if(i % 5 == 0) replaceStr.append("Buzz");
            if(i % 7 == 0) replaceStr.append("Woof");

            if(replaceStr.length() > 0) System.out.println(replaceStr.toString());
            else System.out.println(i);

        }
    }
}

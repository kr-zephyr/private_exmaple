package practicelambda;

public class DelegateFunc {

    public static void main(String[] args) {
        // Function 정의
        CountFunc cCount = (c) -> c.length;

        System.out.println("도메인의 캐릭터 수 :: " + countDomain(cCount));
        System.out.println("특정 문자열의 캐릭터 수 :: " + countHello(cCount));
    }

    static int countDomain(CountFunc countFunc) {
        return countFunc.count("http://www.google.com".toCharArray());
    }

    static int countHello(CountFunc countFunc) {
        return countFunc.count("Hello world!".toCharArray());
    }
}

@FunctionalInterface
interface CountFunc {
    int count(char[] c);
}

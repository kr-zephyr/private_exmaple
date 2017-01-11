package practicelambda;

public class PracticeLambda {

    public static void main(String[] args) {
        Func add = (int a, int b) -> a + b;
        System.out.println("sum 2, 3 :: " + add.add(2, 3));
    }
}

@FunctionalInterface
interface Func {
    int add(int x, int y);
}
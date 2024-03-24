@FunctionalInterface
interface A{
    int add(int i, int j);
}

public class Lambda {
    public static void main(String[] args) {
        A obj = (i,j) -> i+j;   // no need to type `return` in lambda expression
        int result = obj.add(5,8);
        System.out.println(result);
    }
}

class Calculator{
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }

    public int add(int n1, int n2, int n3){
        int r = n1 + n2 + n3;
        return r;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        int n1 = 3, n2 = 4, n3 = 5;

        Calculator calc = new Calculator();
        int r1 = calc.add(n1, n2);
        System.out.println(r1);

        int r2 = calc.add(n1, n2, n3);
        System.out.println(r2);
    }
}

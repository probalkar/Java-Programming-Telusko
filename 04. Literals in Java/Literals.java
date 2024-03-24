public class Literals {
    public static void main(String[] args) {
        // integer
        int num1 = 0b101;
        int num2 = 0x7e;
        int num3 = 10_10_10_000;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // double
        double d1 = 56;
        double d2 = 12e10;
        System.out.println(d1);
        System.out.println(d2);

        // boolean
        boolean b = true;
        System.out.println(b);

        // character
        char c = 'a';
        System.out.println(c);
        c++;
        System.out.println(c);
    }
}

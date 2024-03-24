// boxing: converting primitive datatype object to it's corresponding wrapper class object
// auto-boxing: automatically performing boxing
// unboxing: converting wrapper class object to it's corresponding primitive datatype object
// auto-unboxing: automatically performing unboxing

public class Wrapper {
    public static void main(String[] args) {
        int num = 7;
        // Integer num1 = new Integer(num);    // boxing
        Integer num1 = num;     // auto-boxing
        System.out.println(num1);

        // int num2 = num1.intValue();     // unboxing
        int num2 = num1;    // auto-unboxing
        System.out.println(num2);

        String str = "7";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}

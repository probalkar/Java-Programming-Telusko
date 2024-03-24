public class Type_Conversion {
    public static void main(String[] args) {
        // Implicit type casting
        byte b = 12;
        int a = b;
        System.out.println(a);  // works perfectly

        // int c = 12;
        // byte d = c;     // this will throw an error due to the fear of losing information as byte is smaller than int

        // explicit type casting
        int c = 12;
        byte d = (byte)c;
        System.out.println(d);  // this will work

        // when value out of range
        int e = 257;
        byte f = (byte)e;   // behind the scene computation: f = e%256 <- 256 is total range of byte datatype => f = 1
        System.out.println(f);

        float g = 5.6f;
        int h = (int)g;     // we will lose .6 here
        System.out.println(h);

        // type promotion
        byte b1 = 10;
        byte b2 = 30;
        int result = b1 * b2;   // b1*b2 will result a number out of range of byte datatype so by storing it in int datatype compiler is promoting it's datatype
        System.out.println(result);
    }
}

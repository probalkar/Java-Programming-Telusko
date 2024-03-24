// lambda expressions can only be used with functional interfaces
@FunctionalInterface
interface A{    
    // void show(int i, int j);
    void show(int i);
}

public class Lambda {
    public static void main(String[] args) {
        // A obj = (i,j) -> System.out.println("in show " + (i+j));
        // no need to mention variable datatype when passing arguments
        // also no need of {} when writing only one statement

        // obj.show(5,8);

        A obj = i -> System.out.println("in show " + i);
        // no need to put variable inside () when passing only one argument
        obj.show(5);
    }
}

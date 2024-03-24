// super() method calls the default constructor of the super/parent class
// super(x1,x2,...) method calls the parameterized constructor of the super/parent class based on the parameters
// every user defined class in java extends the Object class
// this() method calls the default constructor of the same class

class A{
    public A(){
        super();    // by default called first inside every constructor
        System.out.println("in A");
    }

    public A(int n){
        super();    // by default called first inside every constructor
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        // super(5);    // by default called first inside every constructor
        super();
        System.out.println("in B");
    }

    public B(int n){
        // super();    // calls default constructor of A    // by default called first inside every constructor
        // super(n);   // calls parameterized constructor of A
        this();     // calls the default constructor of B first
        System.out.println("in B int");
    }
}

public class this_and_super_methods {
    public static void main(String[] args) {
        // B obj = new B();
        /* prints... when "super();" is written in default B constructor
         * in A
         * in B
         */
        /* prints... when "super(5);" is written in default B constructor
         * in A int
         * in B
         */

        B obj = new B(5);
        /* prints... when "super();" is written in parameterized B constructor
         * in A
         * in B int
         */
        /* prints... when "super(n);" is written in parameterized B constructor
         * in A int
         * in B int
         */
        /* prints... when "this();" is written in parameterized B constructor
         * in A
         * in B
         * in B int
         */
    }
}

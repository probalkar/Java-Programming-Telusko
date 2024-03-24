class A{
    public void show(){
        System.out.println("in show");
    }

    class B{    // non-static inner class
        public void config(){
            System.out.println("in config");
        }
    }

    static class C{ // static inner class
        public void print(){
            System.out.println("in C print");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B(); // need object of outer class to create object of inner class if the inner class is not static
        obj1.config();

        A.C obj2 = new A.C();   // need to follow this syntax if the inner class is static and want to create an object of inner class
        obj2.print();
    }
}

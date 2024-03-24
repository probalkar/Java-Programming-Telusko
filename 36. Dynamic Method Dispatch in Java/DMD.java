class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}

class D{
    public void show(){
        System.out.println("in D show");
    }
}

public class DMD {
    public static void main(String[] args) {
        // A obj = new A();    // creates a reference of class A pointing to object of class A

        // A obj = new B();    // creates a reference of class A pointing to object of class B
                            // works in only in inheritance
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // obj = new D();  // this will give an error as class D is not extending class A
        obj.show();
    }
}

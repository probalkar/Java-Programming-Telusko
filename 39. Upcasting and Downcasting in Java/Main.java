class A{
    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();    // upcasting : referencing the superclass for the object of subclass
        obj.show1();    // can only access the show1() method of superclass

        B obj1 = (B) obj;   // downcasting : creating a new reference of subclass by explicitly typecasting the reference object of superclass 
        obj1.show2();   // can now access show1() and show2() method both
    }
}

// by default all methods in an interface are `public` `static`
// by default all variables in an interface are `public` `static` `final`
// `interface` behind the scenes means `abstract` `class`

// class - class -> `extends`
// class - interface -> `implements`
// interface - interface -> `extends`

// cannot instantiate an interface in java

interface A{
    int age = 20;
    String place = "Pune";

    void show();    
    void config();
}

interface X{
    void run();
}

interface Y extends X{

}

class B implements A{
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }
}

class C implements X,Y{ // implementing multiple interfaces in a class
    public void run(){
        System.out.println("running...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        A obj = new B();    // reference of interface A, object of class B
        obj.show();
        obj.config();
        System.out.println(A.age);
        System.out.println(A.place);

        X obj1 = new C();   // reference of interface X, object of class C
        obj1.run();
    }
}

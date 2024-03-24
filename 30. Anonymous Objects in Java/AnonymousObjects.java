class A{
    public A(){
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("In A show");
    }
}

public class AnonymousObjects {
    public static void main(String[] args) {
        A a = new A();  // reference object; can be used again
        a.show();

        new A(); // anonymous object; cannot be used again in future
        new A().show();
    }
}
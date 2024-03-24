class A{
    public void show(){
        System.out.println("in A show");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A(){    // syntax for defining anonymous inner class with no name
            @Override
            public void show(){
                System.out.println("in new show");
            }
        };

        obj.show();
    }
}

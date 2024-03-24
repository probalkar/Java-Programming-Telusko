abstract class A{
    public abstract void show();
    public abstract void config();
}

public class Main {
    public static void main(String[] args) {
        A obj = new A() {   // can use anonymous inner class in case of abstract outer class
            @Override
            public void show(){
                System.out.println("in new show");
            }

            @Override
            public void config(){
                System.out.println("in new config");
            }
        };

        obj.show();
        obj.config();
    }
}

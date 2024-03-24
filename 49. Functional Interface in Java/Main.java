@FunctionalInterface    // a functional interface can have only one method
// it is also Single Abstract Method Interface, aka SAM Interface
interface A{    
    void show();
}

public class Main {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in show");
            }
        };

        obj.show();
    }
}

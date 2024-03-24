class A{
    public void show() throws ClassNotFoundException{
        // Class.forName("Main");
        Class.forName("Calc");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
            System.out.println("All good!");
        }
        catch(Exception e){
            System.out.println("We have a problem... " + e);
        }
    }
}
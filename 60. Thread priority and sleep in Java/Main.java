class A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi"); 
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.getStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.getStackTrace();
            }  
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // getting the priority of the threads | by default every thread has priority of 5 (0-10, where 0 is least priority and 10 is highest priority, 5 is normal priority)
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        // setting priority of the threads for the scheduler
        // obj1.setPriority(Thread.MIN_PRIORITY);
        // obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try{
            Thread.sleep(5);
        }
        catch(InterruptedException e){
            e.getStackTrace();
        }
        obj2.start();
    }
}
class Counter{
    int count;
    // synchronized keyword makes sure that increment() is called only once at a particular time
    public synchronized void increment(){
        count++;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i=1;i<=1000;i++){
                c.increment();
            }
        };
        
        Runnable obj2 = () -> {
            for(int i=1;i<=1000;i++){
                c.increment(); 
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        System.out.println(c.count);    // may not give output=2000 always as both threads might call increment() at the same time thus count is incremented only once instead twice -> to solve this use synchronized keyword in your function declaration.
    }
}
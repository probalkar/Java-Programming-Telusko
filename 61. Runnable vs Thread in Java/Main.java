// class A implements Runnable{
//     public void run(){
//         for(int i=1;i<=100;i++){
//             System.out.println("hi"); 
//             try{
//                 Thread.sleep(10);
//             }
//             catch(InterruptedException e){
//                 e.getStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
//         for(int i=1;i<=100;i++){
//             System.out.println("hello");
//             try{
//                 Thread.sleep(10);
//             }
//             catch(InterruptedException e){
//                 e.getStackTrace();
//             }  
//         }
//     }
// }

public class Main {
    public static void main(String[] args) {
        // Reference variable of interface, Object of class
        // Runnable obj1 = new A();
        // Runnable obj2 = new B();

        // Using anonymous interface
        // Runnable obj2 = new Runnable(){
        //     public void run(){
        //         for(int i=1;i<=100;i++){
        //             System.out.println("hi");
        //             try{
        //                 Thread.sleep(10);
        //             }
        //             catch(InterruptedException e){
        //                 e.getStackTrace();
        //             }  
        //         }
        //     }
        // };

        // Runnable obj1 = new Runnable(){
        //     public void run(){
        //         for(int i=1;i<=100;i++){
        //             System.out.println("hello");
        //             try{
        //                 Thread.sleep(10);
        //             }
        //             catch(InterruptedException e){
        //                 e.getStackTrace();
        //             }  
        //         }
        //     }
        // };

        // Using lambda expressions
        Runnable obj1 = () -> {
            for(int i=1;i<=100;i++){
                System.out.println("hi");
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.getStackTrace();
                }  
            }
        };
        
        Runnable obj2 = () -> {
            for(int i=1;i<=100;i++){
                System.out.println("hello");
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.getStackTrace();
                }  
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
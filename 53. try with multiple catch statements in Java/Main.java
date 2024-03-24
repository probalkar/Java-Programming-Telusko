public class Main {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        
        int nums[] = new int[5];

        try{
            j = 18/i;
            System.out.println(nums[0]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException ae){
            System.out.println("You cannot divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException arr){
            System.out.println("Don't exceed array limit");
        }
        catch(Exception e){
            System.out.println("Something went wrong...");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
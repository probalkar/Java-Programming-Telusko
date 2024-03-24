public class ternary_operator {
    public static void main(String[] args) {
        int n = 5;
        int result = 0;

        // Standard if-else statement
        // if(n%2==0){
        //     result = 10;
        // }
        // else{
        //     result = 20;
        // }

        // Ternary operator
        result = n%2==0 ? 10 : 20;

        System.out.println(result);
    }
}

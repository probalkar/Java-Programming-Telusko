public class Multidimensional_Arrays {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        // Assigning random values to the multidimensional array
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        // Printing the array using normal nested for loop
        System.out.println("Normal nested for loop:");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Printing the array using enhanced nested for loop
        System.out.println("Enhanced nested for loop:");
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

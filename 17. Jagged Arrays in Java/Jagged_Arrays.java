public class Jagged_Arrays {
    public static void main(String[] args) {
        int nums[][] = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        // Assigning random values to the jagged array
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        // Printing the elements in the jagged array
        System.out.println("Enhanced nested for loop:");
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
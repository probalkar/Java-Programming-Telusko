public class if_else{
    public static void main(String[] args) {
        int x = 8;
        int y = 9;

        if(x>y)     // no need to put statement inside curly braces if there is only one statement under if-else
            System.out.println(x + " is greater than " + y);
        // if(x>y){     // need to use cury braces if multiple statements under if-else
        //     System.out.println(x + " is greater than " + y);
        //     System.out.println("Thank you");
        // }
        else
            System.out.println(y + " is greater than " + x);
    }
}
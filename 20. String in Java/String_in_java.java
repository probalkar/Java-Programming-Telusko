public class String_in_java {
    public static void main(String[] args) {
        // Method-1 to declare a string
        String fname = "Probal";
        System.out.println(fname);

        // Method-2 to declare a string
        String lname = new String("Kar");
        System.out.println(lname);

        // String methods
        System.out.println("Smita"+" "+"Jagdale");  // concatenation
        System.out.println(fname.concat(lname));    // .concat() method : concatenates two strings
        System.out.println(fname.charAt(3));    // .charAt() method : returns the character at a particular index of the string
    }
}

public class StringBuffer_in_java {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());  // default capacity of 16 characters

        StringBuffer sb = new StringBuffer("Probal");   // 6 characters
        System.out.println(sb.capacity());  // capacity = 6 + 16 characters
        System.out.println(sb);

        System.out.println(sb.length());    // returns length of the StringBuffer object

        sb.append(" Kar");  // appends to the original string
        System.out.println(sb);

        String str = sb.toString(); // converts StringBuffer type to String
        System.out.println(str);

        // sb.deleteCharAt(2); // deletes character at index 2 in the string
        // System.out.println(sb);

        sb.insert(6, " Java");  // inserts input at a particular index in the original string

        sb.setLength(10);   // till the length of 10 characters are kept and rest are removed

        sb.ensureCapacity(100); // sets a minimum character capacity of 100 characters to be used

        System.out.println(sb);
    }
}

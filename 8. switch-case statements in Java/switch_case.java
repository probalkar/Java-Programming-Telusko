public class switch_case {
    public static void main(String[] args) {
        String day = "Sunday";
        String result = "";

        // Traditional way of switch-case => always need to use break keyword in each case
        // switch(day){
        //     case "Saturday", "Sunday":
        //         result = "8am";
        //         break;
        //     case "Monday":
        //         result = "6am";
        //         break;
        //     default:
        //         result = "7am";
        // }

        // Updated way of switch-case => now can directly use "->" instead, no need to use break keyword
        // switch (day) {
        //     case "Saturday", "Sunday" -> result = "8am";
        //     case "Monday" -> result = "6am";
        //     default -> result = "7am";
        // }

        // Can also directly use switch-case as an expression to return a value in two ways
        // Method-1 (using "->")
        // result = switch(day){
        //     case "Saturday", "Sunday" -> "8am";
        //     case "Monday" -> "6am";
        //     default -> "7am";
        // };  // need to put a ";" after "}" as it is now an expression

        // Method-2 (using ":" with `yield` keyword)
        result = switch(day){
            case "Saturday", "Sunday" : yield "8am";
            case "Monday" : yield "6am";
            default : yield "7am";
        };
        
        System.out.println(result);
    }
}

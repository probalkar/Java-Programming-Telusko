enum Status{
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Pending;
        
        // using if-else statements
        if(s == Status.Running){
            System.out.println("All good");
        }
        else if(s == Status.Failed){
            System.out.println("Try again");
        }
        else if(s == Status.Pending){
            System.out.println("Wait");
        }
        else{
            System.out.println("Done");
        }

        // using switch-case statements
        switch(s){
            case Running -> System.out.println("All good");
            case Failed -> System.out.println("Try again");
            case Pending -> System.out.println("Wait");
            default -> System.out.println("Done");
        }
    }
}

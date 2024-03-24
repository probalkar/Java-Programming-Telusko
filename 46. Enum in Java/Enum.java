enum Status{
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        
        Status s1 = Status.Running;
        Status s2 = Status.Failed;
        Status s3 = Status.Pending;
        Status s4 = Status.Success;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s3.ordinal());

        Status[] ss = Status.values();

        for(Status s : ss){
            System.out.println(s + " : " + s.ordinal());
        }
    }
}

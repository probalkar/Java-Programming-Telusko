class ProbalException extends Exception{
    ProbalException(String string){
        super(string);
    }
}

public class Main {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        
        try{
            j = 18/i;
            if(j==0){
                throw new ProbalException("Probal I don't want to be 0");
            }
        }
        catch(ProbalException pe){
            j = 18/1;
            System.out.println("That's the default output " + pe);
        }
        catch(Exception e){
            System.out.println("Something went wrong...");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
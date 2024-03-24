class Alien{
    public void show(){
        System.out.println("Showing using var");
    }
}

// class var{   // cannot use var as a class name

// }

public class Main {
    public static void main(String[] args) {
        var a = 7;
        System.out.println(a);

        // var b;  // must initialize var

        String var = "Probal";
        System.out.println(var);

        var nums = new int[5];
        for(var n : nums){
            System.out.println(n);
        }

        var alien = new Alien();
        alien.show();
    }
}

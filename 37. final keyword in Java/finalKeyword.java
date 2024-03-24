// final -> variable: makes the variable constant
// final -> method: prohibits method overriding
// final -> class: prohibits class inheritance

/* final */ class Calc{
    final double PI = 3.14;
    // PI = 1.414; // cannot reassign value to PI as it a constant now
    final public void show(){
        System.out.println("by Probal");
    }
}

class AdvCalc extends Calc{
    // public void show(){
    //     System.out.println("by Someone else");
    // }
}

public class finalKeyword {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.show();
    }
}

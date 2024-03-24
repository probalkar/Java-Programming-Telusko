class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvCalc extends Calc{
    @Override   // good practice to mention when overriding inherited methods from parent class
    public int add(int n1, int n2){ // overriding add method inherited from Calc class
        return n1+n2+1;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(3, 4));
    }
}

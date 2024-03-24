package other.tools;  // AdvCalc class is inside tools package which is inside other package

public class AdvCalc extends Calc{
    @Override   // good practice to mention when overriding inherited methods from parent class
    public int add(int n1, int n2){ // overriding add method inherited from Calc class
        return n1+n2+1;
    }
}
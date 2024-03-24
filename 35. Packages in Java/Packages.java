// import tools.AdvCalc;   // importing AdvCalc class from tools package
// import tools.Calc;  // immporting Calc class from tools package
import other.tools.*;   // importing all files inside tools package which is inside other package
// Note: only files are imported from a package and not other folders/packages

public class Packages {
    public static void main(String[] args) {
        Calc obj1 = new Calc();
        System.out.println(obj1.add(3,4));

        AdvCalc obj2 = new AdvCalc();
        System.out.println(obj2.add(3, 4));
    }
}
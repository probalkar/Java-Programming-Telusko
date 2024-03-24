public class Multilevel_Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc calc = new VeryAdvCalc();
        int r1 = calc.add(1, 2);
        int r2 = calc.sub(5, 3);
        int r3 = calc.mul(4, 3);
        int r4 = calc.div(15, 4);
        int r5 = calc.power(4, 2);
        
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
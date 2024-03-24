public class Inheritance {
    public static void main(String[] args) {
        AdvanceCalc calc = new AdvanceCalc();
        int r1 = calc.add(1, 2);
        int r2 = calc.sub(5, 3);
        int r3 = calc.mul(4, 3);
        int r4 = calc.div(15, 4);
        
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}

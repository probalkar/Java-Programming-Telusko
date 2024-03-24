class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj){
        // System.out.println(brand + " : " + price + " : " + name);   // cannot call non static variables in static method
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class Static_method{
    public static void main(String[] args) {
        Mobile.name = "Smartphone";
        
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1000;

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 700;

        // m2.name = "Phone";  // Changes the variable value for all the instances of that class
                            // Not a good practice

        m1.show();
        m2.show();
        System.out.println();

        // m1.show1(m2);   // Can call static methods with the help of objects but not considered a good practice

        Mobile.show1(m1);
        Mobile.show1(m2);
    }
}